// Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

// Note :-  l and r denotes the starting and ending index of the array.

class Solution {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        // Your code here
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
