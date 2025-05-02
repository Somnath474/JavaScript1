public class insertionsort {
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding out correct point to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,9,4,1,7,6};
        insertion(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(i+" ");
        }
    }
}
