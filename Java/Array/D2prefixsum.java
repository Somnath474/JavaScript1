public class D2prefixsum {
    public static void prefix(int number[] ) {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[number.length];
        prefix[0]=number[0];

        for(int i=1;i<number.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }
            for(int i=0;i<number.length;i++){
                int start=i;
                for(int j=i;j<number.length;j++){
                    int end=j;
                    currsum=(start==0) ?prefix[end] :prefix[end]-prefix[start-1];
                    maxsum=Math.max(maxsum,currsum);
                }
            }
            System.out.println("max sum "+maxsum);
        }
        public static void main(String[] args) {
            int number[]={5,6,8,9};
            prefix(number);
        }
    }
   
