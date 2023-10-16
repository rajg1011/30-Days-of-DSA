// For a given postorder and inorder traversal of a Binary Tree of type integer stored in an array/list, create the binary tree using the given two arrays/lists. You just need to construct the tree and return the root.
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

    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int pStart, int pEnd, int[] inOrder, int iStart,
            int iEnd) {
        if (pStart > pEnd || iStart > iEnd) {
            return null;
        }
        int rootVal = postOrder[pEnd];
        BinaryTreeNode<Integer> ans = new BinaryTreeNode<>(rootVal);
        int k = 0;
        for (int i = 0; i < inOrder.length; i++) {
            if (inOrder[i] == rootVal) {
                k = i;
                break;
            }
        }

        ans.left = buildTree(postOrder, pStart, pStart + (k - iStart) - 1, inOrder, iStart, k - 1);
        ans.right = buildTree(postOrder, pStart + (k - iStart), pEnd - 1, inOrder, k + 1, iEnd);
        return ans;

    }

    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        // Your code goes here
        return buildTree(postOrder, 0, postOrder.length - 1, inOrder, 0, inOrder.length - 1);
    }

}