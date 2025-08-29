

public class nokia {
    int age = 10;
    private nokia() {
        System.out.println("no para consrructor ");

    }
    private nokia (String name) {
        System.out.println("no para consructor");


    }
    private  nokia (String name , int age){
        System.out.println("no para consructor ");
    }
    public static void main(String[] args) {
        nokia n = new nokia();
        nokia n1 = new nokia();
        

        new nokia("Swastika");
        new nokia("Shivam", 24);

    }
}
