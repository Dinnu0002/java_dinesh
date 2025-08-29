package Recursion;

public class recursion {
    public static void printnumbers(int n){
        if (n== 8){
            return;
        }
        System.out.println( n );
        printnumbers(n+1);
    }
    public static void main(String[] args) {
        int n = 1;
        printnumbers(n+1);
    }
}
