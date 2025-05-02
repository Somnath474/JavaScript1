public class binarysearch {
    public static int binary(int numbers[],int key) {
        int start=0,end=numbers.length -1;
       while(start<=end){
        int mid=(start+end)/2;
        if(numbers[mid]==key){
            return mid;
        }
        if(numbers[mid]<key){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }

    return -1;
}
public static void main(String[] args) {
    int numbers[]={2,5,9,11,16,17,28,35,39,40,45,55,69};
    int key=19;
    int index=binary(numbers, key);
    System.out.println("Key is at index:"+index);
}
}
