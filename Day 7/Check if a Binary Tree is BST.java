// Given a binary tree with N number of nodes, check if that input tree is BST (Binary Search Tree). If yes, return true, return false otherwise.
// Note:
// Duplicate elements should be kept in the right subtree.

/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

 */

class Pair {
    boolean isBST;
    int min;
    int max;

    Pair(boolean isBST, int min, int max) {
        this.isBST = isBST;
        this.min = min;
        this.max = max;
    }
}

public class Solution {

    public static Pair isBST1(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return new Pair(true, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Pair leftans = isBST1(root.left);
        Pair rightans = isBST1(root.right);

        int minFinal = Math.min(root.data, Math.min(leftans.min, rightans.min));
        int maxFinal = Math.max(root.data, Math.max(leftans.max, rightans.max));
        boolean isBSTFinal = leftans.isBST && rightans.isBST && root.data > leftans.max && root.data <= rightans.min;
        return new Pair(isBSTFinal, minFinal, maxFinal);

    }

    public static boolean isBST(BinaryTreeNode<Integer> root) {

        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        return isBST1(root).isBST;
    }

}