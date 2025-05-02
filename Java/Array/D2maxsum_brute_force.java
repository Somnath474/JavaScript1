public class D2maxsum_brute_force {
    public static void maxsum(int number[]) {
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
             
                int currsum=0;
              
                for(int k=start;k<=j;k++){
                    currsum+=number[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
            
        }
        System.out.println("max subarray is "+maxsum);
        
    }
    public static void main(String[] args) {
        int number[]={5,-9,6,1,-3,4};
        maxsum(number);
    }
    
}
