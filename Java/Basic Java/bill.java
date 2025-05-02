import java.util.*;
public class bill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost of each items");
        float pen=sc.nextFloat();
        float book=sc.nextFloat();
        float copy=sc.nextFloat();
        float total=pen+book+copy;
        System.out.println("The total cost of bill is :"+total);
        sc.close();
       float withgst=(float)total+total*0.18F;
        System.out.println("The total cost of items with GST is:"+withgst);
    }
}
