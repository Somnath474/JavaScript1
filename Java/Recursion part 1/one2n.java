public class one2n {
    public static void increase (int n) {
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        increase(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        increase(10);
    }
}
