class myQueue {
int front;
int last;
int[] a;
int size;

    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        a = new int[n];
        front = -1;
        last = -1;
        size = n;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        if(front == -1)
        return true;
        return false;
    }

    public boolean isFull() {
        // Check if queue is full
        if(last == size-1 && front != last)
        return true;
        return false;
    }

    public void enqueue(int x) {
        // Enqueue
        if(front == -1 && last == -1)
        {
            a[++last] = x;
            front++;
        }
        else
        {
            a[++last] = x;
        }
    }

    public void dequeue() {
        // Dequeue
        if(isEmpty())
        {
            return;
        }
      else  if(front == last)
        {
            
            front = -1;
            last = -1;
        }
       else 
        {
           
            front++;
        }
    }

    public int getFront() {
        // Get front element
        if(!isEmpty())
        return a[front];
        return -1;
    }

    public int getRear() {
        // Get last element
        if(!isEmpty())
        return a[last];
        return -1;
    }
}
