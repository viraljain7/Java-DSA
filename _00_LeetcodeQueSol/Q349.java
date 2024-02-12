package _00_LeetcodeQueSol;
import java.util.HashSet;

public class Q349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Use a HashSet to store the elements of nums1
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        // Use another HashSet to store the intersection elements
        HashSet<Integer> intersection = new HashSet<>();
        for (int num : nums2) {
            // If the element is in the first set, add it to the intersection
            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        // Convert the intersection set to an array and return it
        int[] result = new int[intersection.size()];
        int index = 0;
        for (int num : intersection) {
            result[index++] = num;
        }
        return result;
    }

}
