package _00_LeetcodeQueSol;

public class Q852 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 8, 9, 14, 17, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        System.out.println(peakElementinMountainArr(arr));
    }

    public static int peakElementinMountainArr(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m > 0 && m <= arr.length) {

                if (arr[m] > arr[m - 1] && arr[m] > arr[m + 1]) {
                    return arr[m];
                } else if (arr[m] > arr[m - 1]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }

        }


        return -1; // return number

    }
}
