package _01_Basic;

public class Shadowing {
   static int a=304;
    public static void main(String[] args) {
        System.out.println(a);
        int a=34;
        System.out.println(a);
    }
}
