public class arraya {
    public static int linear(int num[],int key ){
        for(int i=1;i<=num.length;i++){
            if(num[i]==key){
            return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={5,9,2,6,8,9,1};
        int index=linear(num, 8);
        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at index"+index);
        }
    }
}

