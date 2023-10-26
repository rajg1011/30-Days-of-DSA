// For a given Binary Tree of type integer and a number K, print out all root-to-leaf paths where the sum of all the node data along the path is equal to K.
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

    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k, String str) {
        if (root == null)
            return;
        if (root.data == k && root.left == null && root.right == null) {

            System.out.println(str + root.data);
            return;
        }
        str += root.data + " ";
        rootToLeafPathsSumToK(root.left, k - root.data, str);
        rootToLeafPathsSumToK(root.right, k - root.data, str);
    }

    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
        // Your code goes here
        rootToLeafPathsSumToK(root, k, "");
    }

}