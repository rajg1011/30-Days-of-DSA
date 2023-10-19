// For a given preorder and inorder traversal of a Binary Tree of type integer stored in an array/list, create the binary tree using the given two arrays/lists. You just need to construct the tree and return the root.
// Note:
// Assume that the Binary Tree contains only unique elements. 
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

    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int pstart, int pend, int[] inOrder, int istart,
            int iend) {
        if (pstart > pend || istart > iend) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(preOrder[pstart]);
        int k = istart;
        for (int i = istart; i < inOrder.length; i++) {
            if (inOrder[i] == preOrder[pstart]) {
                k = i;
                break;
            }
        }
        root.left = buildTree(preOrder, pstart + 1, pstart + k - istart, inOrder, istart, k - 1);
        root.right = buildTree(preOrder, pstart + k - istart + 1, pend, inOrder, k + 1, iend);
        return root;
    }

    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
        // Your code goes here
        return buildTree(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1);
    }

}