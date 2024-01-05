package _05_Searching;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr={9,7,6,5,4,3,-1,-3,-4,-90};
        int target=-1;
        System.out.println(orderAgnosticBinarySearch(arr,target));
    }

    public static int orderAgnosticBinarySearch(int[] arr ,int target ){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                start=mid+1;
            }else{
                end =mid-1;
            }

        }
        return -1;
    }
}
