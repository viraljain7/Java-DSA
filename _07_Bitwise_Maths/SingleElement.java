package _07_Bitwise_Maths;

public class SingleElement {
    public static void main(String[] args) {
        int []arr={1,2,3,1,2,3,19,1,2,3,1,2,3};
        System.out.println(findSingleNumber(arr,4));

    }
    public static int findSingleNumber(int[] nums,int Repeatedtimes) {
        int result = 0;

        // Count occurrences of each bit position modulo Repeatedtimes
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int num : nums) {
                count += (num >> i) & 1;
            }
            result |= (count % Repeatedtimes) << i;
        }

        return result;
    }




}
