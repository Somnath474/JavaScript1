public class selecton_sort {
    public static void selection(int arr[]) {
        int i;
        int min;
        for(i=0;i<arr.length-1;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
                //swap
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;   
        }
    }
    public static void main(String[] args) {
        int arr[]={1,9,5,7,9,5};
        selection(arr);
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    }
}
