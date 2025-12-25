/*
  class Node {
   int data;
    Node next;

    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
        Node node = head;
        while(node != null)
        {
            if(node.data == key)
            return true;
            else
            node = node.next;
        }
        return false;
    }
}