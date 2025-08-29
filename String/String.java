public class String {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 6;
        int d = a++ + b++ + c++ + a-- + b-- + --c + a-- + b++ + a-- + ++b +--c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
