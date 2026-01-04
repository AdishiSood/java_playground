package Searching;
/*
    ✔️ Ceil : The smallest element in the array that is greater than or equal to the target.
 */

public class CeilOfANumber {
    public static void main(String[] args) {
        int arr[] = {10,14,21,28,39,45};
        int target = 18;
        System.out.println(search(arr,target));
    }
    static int search(int arr[], int target){
        int start =0;
        int end=arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
       // What if target is greater than all elements?
        if(start==arr.length){
            return -1; // no ceil exists
        }
        return arr[start];
    }
}
