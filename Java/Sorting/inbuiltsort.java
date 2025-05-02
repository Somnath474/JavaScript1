import java.util.Arrays;
import java.util.Collections;
public class inbuiltsort {
    public static void main(String[] args) {
        Integer arr[]={2,1,8,0,3};
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
