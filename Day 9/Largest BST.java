public class Solution {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */

	 static class Pair{
		 boolean isBST;
		 int height;
		 int min;
		 int max;

		 Pair(boolean isBST, int height, int min, int max){
			 this.isBST=isBST;
			 this.height=height;
			 this.min=min;
			 this.max=max;
		 }
	 }

	 public static Pair isBSTandHeight(BinaryTreeNode<Integer> root){
		 if(root==null){
			 return new Pair(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
		 }
		 Pair left= isBSTandHeight(root.left);
		 Pair right=isBSTandHeight(root.right);

		 boolean isBSTFinal= left.isBST && right.isBST && root.data>left.max && root.data<=right.min;
		  int heightFinal= Math.max(left.height,right.height);
		 if(isBSTFinal) heightFinal= Math.max(left.height,right.height)+1
		 int minFinal=Math.min(left.min,Math.min(root.data,right.min));
		 int maxFinal= Math.max(root.data,Math.max(left.max,right.max));

		 return new Pair(isBSTFinal,heightFinal,minFinal,maxFinal);

	 }
	
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		return isBSTandHeight(root).height;
	}

}