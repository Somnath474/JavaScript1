public class d2interfaces {
  public static void main(String[] args) {
    Queen q=new Queen();
    q.moves();
  }  
}
interface Chessplayer{
  void moves();
}
class Queen implements Chessplayer{
      public void moves(){
        System.out.println("up down left right diagonal  ");
      }
}
class King implements Chessplayer{
  public void moves(){
    System.out.println("Up down left right diagonal in one step");
  }
}
 class Hook implements Chessplayer{
  public void moves(){
    System.out.println("up down left right ");
  }
 }