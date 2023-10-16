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

    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int pStart, int pEnd, int[] inOrder, int iStart,
            int iEnd) {
        if (iStart > iEnd || pStart > pEnd)
            return null;
        BinaryTreeNode<Integer> ans = new BinaryTreeNode<>(preOrder[pStart]);
        int k = 0;
        for (int i = iStart; i < inOrder.length; i++) {
            if (inOrder[i] == preOrder[pStart]) {
                k = i;
                break;
            }
        }
        ans.left = buildTree(preOrder, pStart + 1, pStart + (k - iStart), inOrder, iStart, k - 1);
        ans.right = buildTree(preOrder, pStart + (k - iStart) + 1, pEnd, inOrder, k + 1, iEnd);
        return ans;
    }

    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
        // Your code goes here
        return buildTree(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1);
    }

}