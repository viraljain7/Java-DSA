package _01_Basic;

import java.util.Arrays;

public class VarArg {
    public static void main(String[] args) {
        print(1, 2, 3, 4, 40, 5);
    }
    static void print(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
