public class tiling_problem {
    public static int trialing(int n) { //2*n floor
        if(n==0 || n==1){
            return 1;
        }
        int vertical=trialing(n-1);
        int horizontal=trialing(n-2);
        int total=vertical+horizontal;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(trialing(4));
    }
}
