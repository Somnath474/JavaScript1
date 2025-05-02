import java.util.*;
public class prime {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n==2)
    System.out.println("is prime");
   else{

   boolean isPrime=true;
    for(int i=2;i<Math.sqrt(n);i++){
        if(n%i==0){
            isPrime=false;
        }
    }
    if(isPrime==true)
    System.out.println("Is prime");
    else
    System.out.println("Not a prime");
    }
    sc.close();
        
}
    
}

