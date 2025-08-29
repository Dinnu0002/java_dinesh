
import java.util.Scanner;

public class Count_Digit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter any number");
        int n = sc.nextInt();
        int count = 0;
        
        while(n>0) {

        n =    n/10;
        count++;
        
        
        System.out.println("value of n = "+n);
        System.out.println("value of count = "+n);
        System.out.println("=========== ");




    }
 }
}
