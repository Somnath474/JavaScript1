import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();
        System.out.println("Enter value of b");
        int b=sc.nextInt();
        System.out.println("Enter the operation you want to perform");
        char operator=sc.next().charAt(0);
        System.out.println("The answer is:");
        switch(operator){
            case '+':System.out.println(a+b);
                     break;
            case '-':System.out.println(a-b);
                    break;
            case '*':System.out.println(a*b); 
                    break;
            case '/':System.out.println(a/b);
                    break;
            default:System.out.println("Wrong input");                                
        }
        sc.close();
    }
}
