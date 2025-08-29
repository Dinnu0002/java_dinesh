package java_with.constructotr;

public class apple {

    static int price = 86000;
    char laptab_name;
    String owner_name;
    public apple(int price, String aptab_name, String owner_name)
{
    this.price = price;
    this.laptab_name = laptab_name;
    this.owner_name = owner_name;
    System.out.println("good macbook laptab");
}
    

    public static void main( String[] args) {
      
        apple a = new apple(86000, "apple" , "dinnu");
        apple a1 = new apple(30000 , "macbook", "Harsh");

      //  System.out.println(apple.int price());
        
// System.out.println(apple.name());
        
    } 
    
}
