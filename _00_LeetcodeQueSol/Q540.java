package _00_LeetcodeQueSol;

import java.util.Arrays;

public class Q540 {
    public static void main(String[] args) {
        int[] a = {4, 4, 4, 4, 4, 4, 4, 4, 5, 6, 7, 0, 1, 2};
//        System.out.println(pivot(a));

        int t = 5;

        System.out.println(S(a, t));
    }

    public static int S(int[] arr, int target) {
        int idx = pivot(arr);

        int res = binarySearch(arr, target, 0, idx);
        if (res == -1) {
            res = binarySearch(arr, target, idx + 1, arr.length - 1);
        }
        return res;
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }


    public static int pivot(int[] arr) {
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m < e && arr[m] > arr[m + 1]) return m;
            if (m > s && arr[m] < arr[m - 1]) return m - 1;

            else if (arr[m] < arr[s]) {
                e = m - 1;
            } else {
                s = m + 1;
            }

        }
        return -1;
    }

}
