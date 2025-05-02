import java.util.*;
public class condition {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int a=50,b=800,c=400;
       if((a>=b) && (a>=c)){
        System.out.println("a is greatest");
       }
       else if(b>=c){
        System.out.println("b is greatest");
       }
       else{
        System.out.println("c is greatest");
       }
       sc.close();


    }
    
}
