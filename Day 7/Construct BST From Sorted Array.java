// Given a sorted integer array A of size n, which contains all unique elements. You need to construct a balanced BST from this input array. Return the root of constructed BST.
// Note: If array size is even, take first mid as root.

public class Solution {

    /*
     * Binary Tree Node class
     * 
     * class BinaryTreeNode<T> {
     * T data;
     * BinaryTreeNode<T> left;
     * BinaryTreeNode<T> right;
     * 
     * public BinaryTreeNode(T data) {
     * this.data = data;
     * }
     * }
     */

    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int start, int end) {
        if (start > end)
            return null;

        int mid = start + (end - start) / 2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        root.left = SortedArrayToBST(arr, start, mid - 1);
        root.right = SortedArrayToBST(arr, mid + 1, end);
        return root;
    }

    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n) {
        return SortedArrayToBST(arr, 0, n - 1);
    }
}