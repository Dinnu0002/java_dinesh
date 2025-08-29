
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int nc= n;
        int rev = 0;

        while(n>0){
            int rem = n%10;
            rev = rev * 10 + rem;
            n = n/10;
        

        }
        if (nc  == rev){
            System.out.println("palindrome");


        }
        else{
            System.out.println("not palindrome");
        }














    }
}
