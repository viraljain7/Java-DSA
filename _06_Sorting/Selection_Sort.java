package _06_Sorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = { 1,2, 3, 4,5, 6, 9, 7, 8};
        selectionSort(arr);
        System.out.println("Array :: "+Arrays.toString(arr));
    }
    public static void selectionSort(int [] arr){
        for (int i = 1; i < arr.length ; i++) {
            int maxidx=0;
            for (int j = 0; j < arr.length-i ; j++) {
                System.out.println(i + " " + j);
                if(arr[maxidx]<arr[j+1]){
                   maxidx=j+1;
                }

            }
            swap(arr,maxidx, arr.length-i);
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }


}
