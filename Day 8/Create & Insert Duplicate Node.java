// For a given a Binary Tree of type integer, duplicate every node of the tree and attach it to the left of itself.
// The root will remain the same. So you just need to insert nodes in the given Binary Tree.

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

    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
        // Your code goes here
        if (root == null)
            return;
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(root.data);
        newNode.left = root.left;
        root.left = newNode;
        insertDuplicateNode(newNode.left);
        insertDuplicateNode(root.right);
    }

}