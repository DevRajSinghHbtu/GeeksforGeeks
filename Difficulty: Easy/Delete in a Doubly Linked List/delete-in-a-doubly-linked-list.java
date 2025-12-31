/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        // code here
        Node temp = head;
        if(x < 2 && head != null)
        {
             
             head = head.next;
             head.prev = null;
            return head;
        }
        for(int i = 1; i<x-1; i++)
        {
            temp = temp.next;
        }
        if(temp.next.next == null)
        {
            temp.next = null;
        }
        else
        {
            temp.next = temp.next.next;
            temp.next.prev = temp;
        }
        return head;
    }
}