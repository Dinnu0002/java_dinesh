public class Car_Driver {
    int price = 30000;
    String color = "Red";
    MusicPlayer  p;
Engine e;
public  void mp(){
    p = new MusicPlayer();

}
{
    e = new Engine();
    System.out.println("constructor with age");

}
public class Engine{
    String cc = "10000";
    String type = "mhauk";

}
public static void main(String[] args) {

    Car_Driver c= new Car_Driver();
    System.out.println("c.price");
    System.out.println("c.color"); 
    System.out.println("c.e.cc");
    System.out.println("c.e.type"); 
// musiic player
c.mp();
System.out.println("c.p");
    System.out.println("c.e.type"); 
}

}
