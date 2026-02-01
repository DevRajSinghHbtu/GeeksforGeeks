// Node class
/* class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} */

// Stack class
class myStack {
    Node list;
    int s = 0;
    public myStack() {
        // Initialize your data members
        list = null;
        s = 0;
    }

    public boolean isEmpty() {
        // check if the stack is empty
       if(s==0)
       return true;
       return false;
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
       Node node = new Node(x);
      node.next = list;
      list = node;
       s++;
    }

    public void pop() {
        // Removes the front element of the stack.
        if(list != null)
        {
           Node temp = list;
           list = list.next;
           temp = null;
        s--;
        }
        
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if(list != null)
        {
           return list.data;
        }
        return -1;
        
    }

    public int size() {
        // Returns the current size of the stack.
        return s;
    }
}
