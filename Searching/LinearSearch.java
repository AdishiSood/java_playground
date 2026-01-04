package Searching;
/*
    Properties:
    ✔️ Works on unsorted data
    ✔️ Best for small datasets
    ✔️ Works on Linked List (LL), since linked lists don’t support random access

    Time Complexity:
    ✔️ Best case: O(1) (element found at first position)
    ✔️ Average case: O(n)
    ✔️ Worst case: O(n) (element at last position or not present)

    Space Complexity:
    ✔️ O(1) (no extra space used)
 */
public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {10,14,2,18,49,45};
        int target = 18;
        System.out.println(search(arr,target));
    }
    static int search(int arr[], int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
