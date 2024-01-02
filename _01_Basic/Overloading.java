package _01_Basic;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {

        print(1,2,4,5);
        print("hello");
        print(5);

    }
    static void print(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void print(int num){
        System.out.println(num);
    }
    static void print(String text){
        System.out.println(text);
    }
}
