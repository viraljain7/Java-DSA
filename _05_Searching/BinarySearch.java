package _05_Searching;

public class BinarySearch {
    public static void main(String[] args) {

        int [] arr={1,2,4,5,6,7,8,9,11,22,32,34,55,66};
        int target=11;
        System.out.println(binarySearch(arr,target));


    }

    public static int binarySearch(int[] arr ,int target ){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }else{
                end =mid-1;
            }

        }
        return -1;
    }
}
