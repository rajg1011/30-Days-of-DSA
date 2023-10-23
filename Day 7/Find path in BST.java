
// Given a BST and an integer k. Find and return the path from the node with data k and root (if a node with data k is present in given BST) in a list. Return empty list otherwise.
// Note: Assume that BST contains all unique elements.
import java.util.ArrayList;

public class Solution {

    /*
     * Binary Tree Node class
     * 
     * class BinaryTreeNode<T> {
     * T data;
     * BinaryTreeNode<T> left;
     * BinaryTreeNode<T> right;
     * public BinaryTreeNode(T data)
     * {
     * this.data = data;
     * }
     * }
     */

    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if (root == null)
            return null;
        if (root.data == data) {
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(root.data);
            return ans;
        }

        if (data > root.data) {
            ArrayList<Integer> right = getPath(root.right, data);
            if (right != null) {
                right.add(root.data);
                return right;
            }
        } else {
            ArrayList<Integer> left = getPath(root.left, data);
            if (left != null) {
                left.add(root.data);
                return left;
            }
        }
        return null;
    }
}