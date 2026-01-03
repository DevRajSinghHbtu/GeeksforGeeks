/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
           if(head == null || head.next == null)
        return head;
       Node midprev = findMiddle(head);
       Node right = midprev.next;
       midprev.next = null;

     Node left = segregate(head);
             right = segregate(right);
     return merge(left, right);
    }
    public Node merge(Node first, Node second)
    {
        Node ans = new Node(0);
        Node temp = ans;
      while(first != null && second != null)
      {
        if(first.data < second.data)
        {
            temp.next = first;
            first = first.next;
            temp = temp.next;
        }
        else
        {
            temp.next = second;
            second = second.next;
            temp = temp.next;
        }
      }
      while(first != null)
      {
        temp.next = first;
            first = first.next;
            temp = temp.next;
      }
      while(second != null)
      {
        temp.next = second;
            second = second.next;
            temp = temp.next;
      }
      return ans.next;
    }
    public Node findMiddle(Node head)
    {
       Node fast = head;
        Node slow = head;
        Node prev = null;
         while(fast != null && fast.next != null)
        {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
            
        }
        return prev;
    }
}