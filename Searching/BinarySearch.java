package Searching;
/*
    Properties:
    ✔️ Array must be sorted
    ✔️ Efficient for large datasets
    ✔️ Divide-and-conquer approach(Two pointers (start and end)
    ✔️ Instead of mid = (start + end) / 2; we use mid = start + (end - start) / 2; to avoid integer overflow.

    Time Complexity:
    ✔️ Best case: O(1) (middle element is target)
    ✔️ Average case: O(log n)
    ✔️ Worst case: O(log n)

    Space Complexity:
    ✔️ Iterative: O(1)
 */
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,14,21,28,39,45};
        int target = 45;
        System.out.println(search(arr,target));
    }
    static int search(int arr[], int target){
        int start =0;
        int end=arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
