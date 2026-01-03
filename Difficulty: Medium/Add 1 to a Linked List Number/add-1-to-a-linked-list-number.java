/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        // code here.
        Node rev = reverse(head);
        Node headnew = null, tail = null;
        int c = 1;
        while(rev != null)
        {
            int a = rev.data + c;
            int b = a%10;
            c = a/10;
            Node temp = new Node(b);
            if(headnew == null)
            {
                headnew = temp;
                tail = temp;
            }
            else
            {
                tail.next = temp;
                tail = temp;
            }
            rev = rev.next;
        }
        if(c != 0)
        {
            Node temp = new Node(c);
            tail.next = temp;
            tail = temp;
        }
        
        return reverse(headnew);
        
    }
    public Node reverse(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node prev = null;
        Node current = head;
        Node next = head.next;
        while(current != null)
        {
            current.next = prev;
            
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