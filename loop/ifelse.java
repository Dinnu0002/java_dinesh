package java_with.loop;


public class ifelse {
    public static void main(String[] args) {
        int age ;
        System.out.println("Enter your age");
        Scanner Sc = new Scanner(System.in);
        age = Sc.NextInt();
        if (age>56){
            System.out.println("you are experienced !");

        } else if (age>45){
            System.out.println("uor are not semi experienced");

        
        }
        else if (age>36){
            System.out.println(" your are semi semi experienced");
        }
    }
}
