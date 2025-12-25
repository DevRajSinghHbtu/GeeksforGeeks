/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        Node node = new Node(x);
        Node temp = head;
        for(int i = 0; i<p; i++)
        {
            temp = temp.next;
        }
        
        
        if(temp.next == null)
        {
            node.next = null;
            
        }
        else
        {
        node.next = temp.next;
        temp.next.prev = node;
        }
        temp.next = node;
        node.prev = temp; 
        
       
        return head;
    }
}