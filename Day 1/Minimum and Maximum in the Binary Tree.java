// For a given a Binary Tree of type integer, find and return the minimum and the maximum data values.
// Return the output as an object of Pair class, which is already created.
// Note:
// All the node data will be unique and hence there will always exist a minimum and maximum node data.

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

/*

	Representation of the Pair Class

	class Pair<T, U> {
		T minimum;
		U maximum;

		public Pair(T minimum, U maximum) {
			this.minimum = minimum;
			this.maximum = maximum;
		}

	}

*/

public class Solution {

    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
        // Your code goes here
        if (root == null) {
            return new Pair<Integer, Integer>(Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Pair<Integer, Integer> ansLeft = getMinAndMax(root.left);
        Pair<Integer, Integer> ansRight = getMinAndMax(root.right);

        int min = Math.min(ansLeft.minimum, Math.min(ansRight.minimum, root.data));
        int max = Math.max(ansLeft.maximum, Math.max(ansRight.maximum, root.data));
        Pair<Integer, Integer> ans = new Pair<>(min, max);
        return ans;
    }

}