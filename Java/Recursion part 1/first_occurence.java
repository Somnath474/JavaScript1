public class first_occurence {
    public static int find(int arr[],int key,int i) {
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return find(arr, key, i+1);
        
    }
    public static void main(String[] args) {
        int arr[]={5,3,4,9,3,1,6,7,9,6,1};
        System.out.println(find(arr, 02, 00));
    }
}
