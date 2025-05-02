public class D2howwlowrhombus {
    public static void rhombus(int n) {
        int i,j;
        for(i=1;i<=n;i++ ){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=n;j++){
                if( i==1 ||i==n|| j==1|| j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        rhombus(8);
    }
}
