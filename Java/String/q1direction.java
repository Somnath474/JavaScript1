public class q1direction {
    public static float direction(String path) {
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='E'){
                x++;
            }
            else if(dir=='W'){
                x--;
            }
            else if(dir=='N'){
                y++;
            }
            else{
                y--;
            }
        }
        int x1=x*x;
        int y1=y*y;
        return (float)Math.sqrt(x1+y1);
    }
    public static void main(String[] args) {
        String path="WNEEENESENNN";
        System.out.println(direction(path));
    }
}
