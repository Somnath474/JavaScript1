public class bit {
    public static void oddoreven(int n) {
        int bitmass=1;
        if((n&bitmass)==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
        
    }
    public static void main(String[] args) {
        oddoreven(5);
        oddoreven(10);
        oddoreven(15);
    }

    
}