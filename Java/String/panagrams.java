import java.util.Arrays;
public class panagrams {
    
    public static boolean check(String str1,String str2) {
    if(str1.length()!=str2.length()){
        return false;
    }
    char arr1[]=str1.toCharArray();
    char arr2[]=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
     return Arrays.equals(arr1,arr2);
}
    public static void main(String[] args) {
        String str1="races";
        String str2="care";
        System.out.println(check(str1, str2));
    }
}