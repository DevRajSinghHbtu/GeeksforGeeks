// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
 Node head;
Node tail;
int s =0;
    public myQueue() {
        // Initialize your data members
        head = null;
        tail = null;
        s = 0;
    }

    public boolean isEmpty() {
        // check if the queue is empty
        return s==0;
    }

    public void enqueue(int x) {
        // Adds an element x at the rear of the queue.
        Node node = new Node(x);
       if(isEmpty())
       {
           head = tail = node;
       }
       else
       {
           tail.next = node;
           tail = node;
       }
       s++;
    }

    public void dequeue() {
        // Removes the front element of the queue
        if(isEmpty())
        {
            return;
        }
        else
        {
            head = head.next;
            s--;
            
        }
    }

    public int getFront() {
        // Returns the front element of the queue.
        // If queue is empty, return -1.
        if(isEmpty())
        return -1;
        return head.data;
    }

    public int size() {
        // Returns the current size of the queue.
        return s;
    }
}
