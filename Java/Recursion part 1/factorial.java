public class factorial {
    public static int factorials(int n) {
        if(n==0){
            return 1;
        }
        int fact=n* factorials(n-1);
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorials(0));
    }
}
