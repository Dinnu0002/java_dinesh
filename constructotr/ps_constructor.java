package java_with.constructotr;

public class ps_constructor {
     int price = 86000;
    char Trinees_name;
    String owner_name;
    public ps_constructor(int price, String aptab_name, String owner_name){

        this();
        this.price=price;
        this.Trinees_name=Trinees_name;
        this.owner_name=owner_name;

    }
    public ps_constructor(int price){
        this();
        this.price=price;

    }
    public ps_constructor(){
        System.out.println("demo");


    }
    public static void main(){
        ps_constructor d= new ps_constructor();
        ps_constructor d1=new ps_constructor();
         System.out.println(d);
    }
}
