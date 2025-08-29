
import java.lang.classfile.TypeAnnotation;

public class ParentClass {
    // Define an abstract class 'Parent' inside 'ParentClass'
    public abstract static class Parent {
        int age = 50;
        static String name = "DC";

        // Non-static method
        public void main() {
            System.out.println("Non-static method");
        }

        // Static initializer block
        static {
            System.out.println("Static Initializer");
        }

        // Constructor
        Parent() {
            System.out.println("Constructor");
        }

        // Abstract method
        public abstract void add();

        // Instance initializer block
        {
            System.out.println("Parent class initializer");
        }
    }

    // Define the 'Child' class inside 'ParentClass'
    public static class Child extends Parent {
        @Override
        public void add() {
            System.out.println("Child class Method");
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Instantiate Child object
        Child c = new Child();
        System.out.println("++++++====== Child class ++++========");
        c.add();

        // Upcasting: Parent reference to a Child object
        Parent p = new Child();
        System.out.println("+++++++======= Upcasting ++++========");
        p.add();
    }
}
