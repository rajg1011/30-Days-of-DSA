// Given a binary tree and an integer S, print all the pair of nodes whose sum equals S.
// Note:
// 1. Assume the given binary tree contains all unique elements.
// 2. In a pair, print the smaller element first. Order of different pairs doesn't matter.

import java.util.ArrayList;
import java.util.Collections;

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

    // private static int pair(BinaryTreeNode<Integer> root, int data,
    // BinaryTreeNode<Integer> curr){
    // if(root==null) return -1;
    // if(root.data==data){
    // if(root.data==curr.data){
    // return -1;
    // }
    // int temp=root.data;
    // root.data=Integer.MIN_VALUE;
    // return temp;
    // }
    // int left=pair(root.left,data,curr);
    // int right=pair(root.right,data,curr);
    // if(left!=-1 && right!=-1){
    // return left;
    // }else if(left==-1 && right!=-1) return right;
    // else if(left!=-1 && right==-1) return left;
    // else return -1;
    // }

    // static void pairSum(BinaryTreeNode<Integer> root, int sum,
    // BinaryTreeNode<Integer> curr){
    // if(curr==null) return;
    // int pair1= curr.data;
    // int pair2= pair(root,Math.abs(sum-curr.data), curr);
    // if(pair2!=-1){
    // if(pair1<=pair2){
    // System.out.println(pair1+" "+ pair2);
    // }
    // else{
    // System.out.println(pair2+" "+pair1);
    // }
    // }
    // pairSum(root, sum, curr.left);
    // pairSum(root, sum, curr.right);
    // }

    static ArrayList<Integer> arr = new ArrayList<>();

    static void traversal(BinaryTreeNode<Integer> root) {
        if (root == null)
            return;
        arr.add(root.data);
        traversal(root.left);
        traversal(root.right);
    }

    static void pairSum(BinaryTreeNode<Integer> root, int sum) {

        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        traversal(root);
        Collections.sort(arr);
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i) + arr.get(j) == sum) {
                System.out.println(arr.get(i) + " " + arr.get(j));
                i++;
                j--;
            } else if (arr.get(i) + arr.get(j) < sum)
                i++;
            else if (arr.get(i) + arr.get(j) > sum)
                j--;
        }

    }

}