package Recursion;

import java_with.loop.for_loop;

public class recursion02 {
    // print factorial of a number n.
    public static void printFacorial(int n, int fact) {
        if (n==0){
            System.out.println(fact);
            return;
        } fact *= n;
        printFacorial(n - 1, fact);
        
    }
    public static void main(String[] args) {
        
        printFacorial(99, 010);
    }
}
