package _02_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arr_2D {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int[][] twoDArr= new int[2][];
        twoDArr[0] = new int[2];
        twoDArr[1] = new int[3];

        twoDArr[0][0]=0;
        twoDArr[1][0]=20;
        System.out.println("1st method "+Arrays.deepToString(twoDArr));

        for (int []i :twoDArr) {
            System.out.println("2nd method "+Arrays.toString(i));
        }

        for (int row=0;row<twoDArr.length;row++) {
            System.out.println("3rd method "+Arrays.toString(twoDArr[row]));
        }

        int[][] newTwoDArr= new int[2][3];
        for (int row = 0; row < newTwoDArr.length ; row++) {
            for (int col = 0; col <newTwoDArr[row].length ; col++) {
                newTwoDArr[row][col]=input.nextInt();
            }
        }


        System.out.println(Arrays.deepToString(newTwoDArr));



        int[][] TD={{1,2,3},{2,3},{3,4,5,6}};
        for (int row = 0; row < TD.length ; row++) {
            System.out.print("[");
            for (int col = 0; col <TD[row].length ; col++) {
                System.out.print(TD[row][col]);
            }
            System.out.println("]");
        }

    }
}
