package _06_Sorting;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 2, 6, 9, 7, 8};
        bubbleSort(arr);
        System.out.println("Array :: "+Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {

        for (int i = 1; i <= arr.length - 1; i++) {
            boolean swapped=false;
            for (int j = 0; j < arr.length - i; j++) {
                System.out.println(i + " " + j+" "+swapped);
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            System.out.println(Arrays.toString(arr));
            if (!swapped) break;
        }
    }




}
