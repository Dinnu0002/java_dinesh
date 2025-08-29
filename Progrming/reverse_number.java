
import java.util.Scanner;

public class reverse_number {
   
    public static void main(String[] args, String string) {
     
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int reversed = 0;
        int rem = 0;
        
        int n = 12345;
        while (n>0)
{
    int rev = n%10;
   rev = rev *10 + rem;
   n = n/10;
   rev++;
 
   System.out.println("value of n = "+n);
   System.out.println("value of rem = "+rem);
   System.out.println("value of rev = "+rev);
   System.out.println("=========== ");

}


    }
}
