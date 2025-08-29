package java_with.polymorphism;

class father{
    void demo()
    {
        System.out.println("parent demo method");
    }
}
class son extends father {
    void demo()
    {
        System.out.println("child demo method");
    }

}
public class cwh_60_polymorphism_ps {
    
    public static void main(String[] args) {
        System.out.println("+++++======parnet object");
        father p1 =new father();

        System.out.println("+++++======upcasting+++=========");
        father p =new father();
        p.demo();

        System.out.println("+++++======child object+++=========");
        son c1 =new son();
        c1.demo();

        System.out.println("+++++======Domocasting+++=========");
        son c= (son) p;

    }
    }


