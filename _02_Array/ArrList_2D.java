package _02_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList_2D {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        for (int i = 0; i <3 ; i++) {
            list.add(new ArrayList<>());
        }

        for (int row = 0; row <3 ; row++) {
            for (int col = 0; col <2 ; col++) {
                list.get(row).add(input.nextInt());
            }
        }

        System.out.println(list);
//<---------------------------------------------------------------------------------->
//<---------------------------------------------------------------------------------->

        // Create a 2D ArrayList
        ArrayList<ArrayList<Integer>> twoDArrayList = new ArrayList<>();

        // Create and add the first row
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(3);
        twoDArrayList.add(row1);

        // Create and add the second row
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        twoDArrayList.add(row2);

        // Access and print elements
        System.out.println(twoDArrayList.get(0).get(1)); // Output: 2

        // Print the entire 2D ArrayList
        for (ArrayList<Integer> row : twoDArrayList) {
            System.out.println(row);
        }
    }
}
