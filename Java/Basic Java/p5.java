import java.util.*;
public class p5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     int number;
     int choice;
     int evensum=0;
     int oddsum=0;
     do{
        
        number=sc.nextInt();
        if(number%2==0){
            evensum+=number;
        }
        else{
            oddsum+=number;
        }
        System.out.println("Press 1 to continue and 0 to stop");
        choice=sc.nextInt();
     }while(choice==1);
     System.out.println("Sum of even number is"+evensum);
     System.out.println("Sum of odd number is"+oddsum);
     sc.close();

}
}