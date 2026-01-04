package Searching;
/*
    ✔️ Floor :The greatest element in the array that is less than or equal to the target.
 */
public class FloorOfANumber {
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
        // If target is smaller than the smallest element
        if (end < 0) {
            return -1; // no floor exists
        }
        return arr[end]; 
        // When the loop terminates, start becomes greater than end. At this point, 
        //end points to the greatest element less than or equal to the target, which is why we return arr[end] as the floor.
    }
}
