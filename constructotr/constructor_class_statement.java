package java_with.constructotr;

public class constructor_class_statement {
    public constructor_class_statement(){
        System.out.println("No Para Constructor");

    }
    public constructor_class_statement(String nameS){
        System.out.println("Single Para Constructor");

    } 

   
    
    public constructor_class_statement(String name , int age){
        System.out.println("Double para constructore");


    }
    public static void main(String[] args) {
        constructor_class_statement c = new constructor_class_statement();
        constructor_class_statement c1 = new constructor_class_statement("Dinnu");
        constructor_class_statement c2 = new constructor_class_statement ("Harsh ", 22);
        System.out.println("++++++++++++++++++++++++++++");
      
    }
    
}
