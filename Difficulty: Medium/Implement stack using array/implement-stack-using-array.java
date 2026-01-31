class myStack {
 int size;
 int top = -1;
 int[] a;
    public myStack(int n) {
        // Define Data Structures
        size = n;
       a = new int[size];
    }

    public boolean isEmpty() {
        // check if the stack is empty
        if(top == -1)
        {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        // check if the stack is full
        if(top >= size-1)
        return true;
        return false;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if(!isFull())
        {
            a[++top] = x; 
        
        }
        
    }

    public void pop() {
        // Removes an element from the top of the stack
        if(!isEmpty())
        {
            int temp = a[top--];
            
        }
        
    }

    public int peek() {
        // Returns the top element of the stack
        if(!isEmpty())
        {
            return a[top];
        }
        return -1;
    }
}