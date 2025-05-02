public class sum_n {
    public static int sum(int n) {
        if(n==1){
            return 1;
        }
        int add=n+sum(n-1);
        return add;
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
