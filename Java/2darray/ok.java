public class ok {
    public static void match(int matrix[][]){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==7){
                    count++;
                }
            }
        }
        System.out.print(count);
    
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,7,3,7},{
            4,5,7,7,8}};
            match(matrix);
    }
}
