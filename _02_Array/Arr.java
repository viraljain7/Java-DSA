package _02_Array;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {



        int [] newArr={1,2,3,4};
        int[] arr = new int[5];
        arr[0] = 1;
        arr[2] = 4;
        arr[4] = 5;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int idx : arr) {
            System.out.print(idx);
        }
        
        System.out.println(Arrays.toString(arr));
//        System.out.println(arr);


        String[] str= new String[5];
        str[0]="vira";
        str[4]="jain";
        for (String idx : str) {
            System.out.print(idx );
        }
    }
}
