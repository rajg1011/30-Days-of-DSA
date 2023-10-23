// Given a BST, convert it into a sorted linked list. You have to return the head of LL.

public class Solution {
    static class Pair {
        LinkedListNode<Integer> head;
        LinkedListNode<Integer> tail;

        Pair(LinkedListNode<Integer> head, LinkedListNode<Integer> tail) {
            this.head = head;
            this.tail = tail;
        }
    }

    public static Pair LL(BinaryTreeNode<Integer> root) {
        if (root == null)
            return new Pair(null, null);

        Pair left = LL(root.left);
        Pair right = LL(root.right);

        LinkedListNode<Integer> rootLL = new LinkedListNode<>(root.data);
        if (left.tail != null)
            left.tail.next = rootLL;
        rootLL.next = right.head;

        LinkedListNode<Integer> headL = null;
        LinkedListNode<Integer> tailL = null;
        if (left.head != null) {
            headL = left.head;
        } else {
            headL = rootLL;
        }
        if (right.tail != null) {
            tailL = right.tail;
        } else {
            tailL = rootLL;
        }

        return new Pair(headL, tailL);

    }

    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        return LL(root).head;
    }
}