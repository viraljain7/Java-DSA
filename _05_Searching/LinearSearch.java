package _05_Searching;

public class LinearSearch {
    public static void main(String[] args) {

        int [] arr={1,2,45,53,2,26,4,5,7,6,9,6};
        int target=53;

        System.out.println(linearSearch(arr,target));
        System.out.println(IslinearSearch(arr,target));
    }
    public static Boolean IslinearSearch(int[]arr,int target){

        if(arr.length==0){
            return false;
        }
        for(int element: arr){
            if(element==target)return true;
        }

        return false;
    }
    public static int linearSearch(int[]arr,int target){

        if(arr.length==0){
            return -1;
        }
        for(int i=0; i<arr.length;i++){
            if(arr[i]==target) return i;
        }

        return -1;
    } public static int linearSearchIndex(int[]arr,int target,int start,int end){

        if(arr.length==0){
            return -1;
        }
        for(int i=start; i<=end;i++){
            if(arr[i]==target) return i;
        }

        return -1;
    }
}
