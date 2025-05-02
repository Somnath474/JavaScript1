public class d2methodoverriding {
    public static void main(String[] args) {
        Deer d=new Deer();
        d.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Eats everything");
    }
}
class Deer{
    void eat(){
        System.out.println("Eats grass");
    }
}
