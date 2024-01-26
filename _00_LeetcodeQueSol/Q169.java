package _00_LeetcodeQueSol;
import java.util.*;
public class Q169 {
    public int majorityElement(int[] nums) {
       // Arrays.sort(nums);
        // return nums[nums.length/2];



        HashMap<Integer, Integer> map= new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++)
        {
            if(map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i])+1);
            else
                map.put(nums[i],1);
        }
        for(int key: map.keySet())
        {
            if(map.get(key) > n/2)
                return key;
        }
        return -1;
    }

}
