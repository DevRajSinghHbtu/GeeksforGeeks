/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    public int getCount(Node head) {
        // code here
        Node node = head;
        int c = 0;
        while(node != null)
        {
            node = node.next;
            c++;
        }
        return c;
        
    }
}