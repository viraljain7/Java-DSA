package _04_String;

public class Str {
    public static void main(String[] args) {
//        string are immutable(not change) due to security reason
//        pool where value of string store

        String a = "Hello";//Both created in string pool and pointing to same refernce
        String b = "Hello";
        System.out.println(a==b);
        b="byy";//here im not change value, created new object

        String d =new String("new");
        String f =new String("new");
        System.out.println(d==f);//== check value and object
        System.out.println(d.equals(f));//equals only check value




    }
}
