package Recursion;

public class recursion01 {
    // print the sum of first n natural number.
    public static void printsum(int n, int sum){ 
        if (n== 0){
            System.out.println(sum);
            return;


        } sum +=n;
        printsum(n -1, sum);


    } public static void main(String[] args) {
        printsum(19, 0);
    }
        
    }

