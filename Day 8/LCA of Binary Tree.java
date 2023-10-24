// Given a binary tree and data of two nodes, find 'LCA' (Lowest Common Ancestor) of the given two nodes in the binary tree.
// LCA
// LCA of two nodes A and B is the lowest or deepest node which has both A and B as its descendants.

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

public class Solution {

    static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {

        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if (root == null)
            return -1;
        if (root.data == a || root.data == b)
            return root.data;
        int left = getLCA(root.left, a, b);
        int right = getLCA(root.right, a, b);
        if (left == -1 && right == -1)
            return -1;
        else if (right == -1)
            return left;
        else if (left == -1)
            return right;
        else
            return root.data;
    }

}