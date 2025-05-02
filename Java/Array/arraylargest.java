public class arraylargest {
    public static void large(int arr[]) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    public static void main(String[] args) {
        int number[]={5,9,-2,8,99,4};
        large(number);
    }
}
