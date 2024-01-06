package _00_LeetcodeQueSol;

public class Q367 {

    public static boolean VPS(int num){

        int start=0;
        int end=num;

        while (start<=end){

            int mid=start+(end-start)/2;
            long square = (long) mid * mid; // Use long to avoid integer overflow

            if (square == num) {
                return true;
            } else if (square < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return false;


    }
}
