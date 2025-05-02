import java.util.*;
public class string {
    public static void main(String[] args) {
        // char arr[]={'a','b','c','d'};
        // String str="abcd";
        // String str2=new String("xyz");

        Scanner sc=new Scanner(System.in);
        String name;
        name=sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
        String fn="Somnath";
        for(int i=0;i<fn.length();i++){
            System.out.print(fn.charAt(i)+" ");
        }
        String ln="Gupta";
        String ffn=fn+ " "+ln;
        System.out.println(ffn+" is good boy");
        sc.close();
    }
}
