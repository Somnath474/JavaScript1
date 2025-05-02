import java.util.*;
public class fun {
   public static void hlo(){
    System.out.println("Hello World");
   } 
   public static void sum(int a,int b){
    int sum=a+b;
    System.out.println(sum);
   }
   public static void main(String[] args) {
    hlo();
    hlo();
    hlo();
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    sum(a,b);
    sc.close();
   }
}
