public class p1 {
    public static void occ(int arr[],int key,int i) {
        if(i==arr.length){
            return ;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        occ(arr, key,i+1);
    
    }
    public static void main(String[] args) {
        int arr[]={2,6,7,2,4,6,2,3,9,8,4};
        occ(arr, 2, 0);
    }
}
