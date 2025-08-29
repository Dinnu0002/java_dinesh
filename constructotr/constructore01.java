package java_with.constructotr;

public class constructore01 {
    String name;
    int age;

    public constructore01(){
        System.out.println("No Para Constructor");

    }
    public constructore01(String nameS){
        System.out.println("Single Para Constructor");

    } 
    public constructore01(String name ,int age){
        this.name= name;
        this.age = age;

    

   
    
    
        System.out.println("Double para constructore");


    }
    public static void main(String[] args) {
        constructore01 c = new constructore01();
        constructore01 c1 = new constructore01 ("Dinnu");
        constructore01 c2 = new constructore01 ("Harsh ", 22);
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println(c1.name);
      System.out.println(c2.age);
    }
}
