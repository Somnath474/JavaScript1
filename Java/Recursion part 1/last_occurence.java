public class last_occurence {
    public static int last(int arr[],int key,int i) {
        if(i==arr.length){
            return -1;
        } 
        int isFound=last(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={5,3,4,9,3,1,6,7,9,6,1};
        System.out.println(last(arr, 06, 00));
    }
    
}
