public class D2kadanealgo {
    public static void kadane(int number[]) {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            currsum+=number[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum=Math.max(currsum,maxsum);
        }
        System.out.println("max sum is"+maxsum);
        
    }
    public static void main(String[] args) {
        int number[]={1,5,-4,8,-3,4,-7,9,10,-2,3};
        kadane(number);
    }
}
