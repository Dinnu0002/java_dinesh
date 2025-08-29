package Recursion;

public class recursion05 {
    public static void printpermutation(String str, int idx, String perm ) {
        for (int i = 0; i<str.length(); i++){
            char currchar = str.charAt(i);
            String newstr = str.substring(i, i)+ str.substring(i+1);
            printpermutation(newstr, idx+1, perm);
        }
        
    }
    public static void main(String[] args) {
        String str = "abc";
        printpermutation(str, 0, "");
    }
}
