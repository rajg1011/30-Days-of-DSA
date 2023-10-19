// You are given a Binary Tree of type integer, a integer value of target node's data, and an integer value K.
// Print the data of all nodes that have a distance K from the target node. The order in which they would be printed will not matter.

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

    public static void print(BinaryTreeNode<Integer> root, int k) {
        if (root == null || k < 0)
            return;
        if (k == 0) {
            System.out.println(root.data);
            return;
        }
        if (k == 1) {
            if (root.left != null) {
                System.out.println(root.left.data);
            }
            if (root.right != null) {
                System.out.println(root.right.data);
            }
            return;
        }
        print(root.left, k - 1);
        print(root.right, k - 1);
    }

    public static int nodesAtDistanceKInt(BinaryTreeNode<Integer> root, int node, int k) {
        if (root == null)
            return -1;
        if (root.data == node) {
            print(root, k);
            return 0;
        }
        int left = nodesAtDistanceKInt(root.left, node, k);
        if (left != -1) {
            if (left + 1 == k) {
                System.out.println(root.data);
            } else {
                print(root.right, k - left - 2);
            }
            return 1 + left;
        }
        int right = nodesAtDistanceKInt(root.right, node, k);
        if (right != -1) {
            if (right + 1 == k) {
                System.out.println(root.data);
            } else {
                print(root.left, k - right - 2);
            }
            return 1 + right;
        }
        return -1;
    }

    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
        // Your code goes here
        nodesAtDistanceKInt(root, node, k);

    }

}