
import java.util.Scanner;

public class ps01 {
    // extract Last digit
public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number");
int n = sc.nextInt();
int res= n%10;
System.out.println(res);

}
}