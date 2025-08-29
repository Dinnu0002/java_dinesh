package java_with.Encapsulation.Inheritance;

Inheritance {
    
    public class mobile {
        int price = 10000;
        String boby = "Steel";
    }
    public class apple extends mobile {
        int price1 = 19990000;
        String boby = "Alum";
    
    public static void main(String[] args) {
       apple a = new apple();
        System.out.println(a.price1);
System.out.println(a.boby);
    }
    }
}
