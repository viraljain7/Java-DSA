package _00_LeetcodeQueSol;

public class Q04 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []res=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        double median=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j])res[k++]=nums1[i++];
            else res[k++]=nums2[j++];
        }
        while(i<nums1.length){
            res[k++]=nums1[i++];
        }
        while(j<nums2.length){
            res[k++]=nums2[j++];
        }
        //   System.out.println(Arrays.toString(res));

        int mid=res.length/2;
        if(res.length%2!=0){ //odd
            median=res[mid];
        }
        else{//even
            median=(res[mid]+res[mid-1])/2.0;
        }
        return median;

    }
}
