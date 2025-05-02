import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int n=number;
        int sum=0;
        while(n!=0){
           int digit= n%10;
           n=n/10;
           sum+=(digit*digit*digit);
        }
        if (sum==number)
        System.out.println("Armstrong number");
        else
        System.out.println("Not a armstrong number");
        sc.close();
        
    }
   

}
