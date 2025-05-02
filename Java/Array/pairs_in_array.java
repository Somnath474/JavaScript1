public class pairs_in_array {
    public static void pair(int number[]){
        int tp=0;
        for(int i=0;i<number.length;i++){
            int current=number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+ current+","+number[j]+")");
                tp++;
            }
            System.out.println();

        }
        System.out.println("Total pairs is "+tp);
    }
    public static void main(String[] args) {
       
        int number[]={2,3,4,5,6,7,8};
        pair(number);
        
    }
}
