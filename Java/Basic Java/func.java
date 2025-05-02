public class func {
    public static int sum(int a,int b) {
        return a+b;
    }
    public static int sum( int a,int b,int c) {
        return a+b+c;
    }
    public static float sum(float e,float f,float d) {
        return e+f+d;
    }
public static void main(String[] args) {
    System.out.println(sum(5,9));
    System.out.println(sum(4,9,7));
    System.out.println(sum(4.5f,5.1f,6.0f));
}
}
