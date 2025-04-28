# --- Libraries we'll use ---
import pandas as pd
import numpy as np
import plotly.graph_objs as go
import ta

# --- Step 1: Generate fake NEPSE stock data for testing ---
np.random.seed(42)
dates = pd.date_range(start="2024-01-01", periods=200)
price = np.cumsum(np.random.randn(200)) + 1200
volume = np.random.randint(10000, 50000, size=200)

data = pd.DataFrame({
    'Date': dates,
    'Open': price + np.random.randn(200),
    'High': price + np.random.rand(200)*5,
    'Low': price - np.random.rand(200)*5,
    'Close': price,
    'Volume': volume
})
data.set_index('Date', inplace=True)

# --- Step 2: Calculate Indicators ---
data['MFI'] = ta.volume.money_flow_index(data['High'], data['Low'], data['Close'], data['Volume'], window=14)
data['RSI'] = ta.momentum.rsi(data['Close'], window=14)

bb = ta.volatility.BollingerBands(data['Close'], window=20, window_dev=2)
data['BB_High'] = bb.bollinger_hband()
data['BB_Low'] = bb.bollinger_lband()
data['BB_Mid'] = bb.bollinger_mavg()

# --- Step 3: Signal Logic ---
data['Buy_Signal'] = ((data['MFI'].shift(1) < 20) & (data['MFI'] >= 20)) & (data['RSI'] < 30)
data['Sell_Signal'] = ((data['MFI'].shift(1) > 80) & (data['MFI'] <= 80)) & (data['RSI'] > 70)

# Bollinger upper band leaving
upper_leave = (data['Close'].shift(1) > data['BB_High'].shift(1)) & (data['Close'] < data['BB_High'])
# Bollinger lower band bounce
lower_bounce = (data['Close'].shift(2) < data['BB_Low'].shift(2)) & (data['Close'].shift(1) < data['BB_Low'].shift(1)) & (data['Close'] > data['BB_Low'])

# Combine with other conditions

data['Sell_Signal'] = data['Sell_Signal'] | (upper_leave & (data['MFI'] < 80) & (data['RSI'] > 70))
data['Buy_Signal'] = data['Buy_Signal'] | (lower_bounce & (data['MFI'] > 20) & (data['RSI'] < 30))

# --- Step 4: Plot Chart ---
candlestick = go.Candlestick(x=data.index,
                              open=data['Open'],
                              high=data['High'],
                              low=data['Low'],
                              close=data['Close'],
                              name='Candles')

bb_high = go.Scatter(x=data.index, y=data['BB_High'], line=dict(color='rgba(173,216,230,0.5)'), name='Upper Band')
bb_low = go.Scatter(x=data.index, y=data['BB_Low'], line=dict(color='rgba(173,216,230,0.5)'), name='Lower Band')
bb_mid = go.Scatter(x=data.index, y=data['BB_Mid'], line=dict(color='rgba(173,216,230,0.5)'), name='Middle Band')

buy_signals = go.Scatter(
    x=data.index[data['Buy_Signal']],
    y=data['Close'][data['Buy_Signal']],
    mode='markers',
    marker=dict(symbol='triangle-up', color='green', size=10),
    name='Buy Signal'
)

sell_signals = go.Scatter(
    x=data.index[data['Sell_Signal']],
    y=data['Close'][data['Sell_Signal']],
    mode='markers',
    marker=dict(symbol='triangle-down', color='red', size=10),
    name='Sell Signal'
)

layout = go.Layout(title='Custom NEPSE Chart with Your Indicator',
                   xaxis_title='Date',
                   yaxis_title='Price',
                   xaxis_rangeslider_visible=False,
                   template='plotly_dark')

fig = go.Figure(data=[candlestick, bb_high, bb_low, bb_mid, buy_signals, sell_signals], layout=layout)

fig.show()
