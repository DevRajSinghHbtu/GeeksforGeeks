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
    LinkedList<Integer> list;
    int s = 0;
    public myStack() {
        // Initialize your data members
        list = new LinkedList<>();
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
       list.addFirst(x);
        s++;
    }

    public void pop() {
        // Removes the front element of the stack.
        if(!list.isEmpty())
        {
            list.removeFirst();
        s--;
        }
        
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if(!list.isEmpty())
        {
            return list.getFirst();
        }
        return -1;
        
    }

    public int size() {
        // Returns the current size of the stack.
        return s;
    }
}
