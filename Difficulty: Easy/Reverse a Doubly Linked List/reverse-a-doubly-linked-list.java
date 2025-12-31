/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        if(head == null || head.next == null)
        return head;
        Node prev = head.prev;
        Node current = head;
        Node next = head.next;
        while(current != null)
        {
            current.next = prev;
            current.prev = next;
            
            prev = current;
            current = next;
            if(next != null)
            {
                next = next.next;
            }
        }
        return prev;
      
    }
}