package proyecto;

public class Stack {
    private linkedList arr[];
    private int top;
    private int capacity;
 
    // Constructor to initialize the stack
    Stack(int size)
    {
        arr = new linkedList[size];
        capacity = size;
        top = -1;
    }
 
    public void printStack(){
        for(int i =0; i <= top;i++){
            System.out.println(arr[i]);
        }
    }
    
    public void push(linkedList x)
    {
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(1);
        }
 
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }
 
    // Utility function to pop a top element from the stack
    public linkedList pop()
    {
        // check for stack underflow
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }       
        // decrease stack size by 1 and (optionally) return the popped element
        return arr[top--];
    }
 
    // Utility function to return the top element of the stack
    public linkedList peek()
    {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(1);
        }
 
        return null;
    }
 
     static void undo(Stack Undo, Stack Redo)
    {   
        // Stores top element
        // of the stack
        linkedList X = Undo.peek();
        // Erase top element
        // of the stack
        Undo.pop();
        // Push an element to
        // the top of stack
        Redo.push(X);
    }
  
    // Function to perform
    // "REDO" operation
    static void redo(Stack Undo, Stack Redo)
    {   System.out.println("Metodo Redo");   
        // Stores the top element
        // of the stack
        linkedList X = Redo.peek();  
        // Erase the top element
        // of the stack
        System.out.println("Metodo Redo.peek");  
        Redo.pop();  
         System.out.println("Metodo Redo.pop"); 
        // Push an element to
        // the top of the stack
        Undo.push(X);
    }
  
    // Utility function to return the size of the stack
    public int size() {
        return top + 1;
    }
 
    // Utility function to check if the stack is empty or not
    public Boolean isEmpty()
    {
        return top == -1;               // or return size() == 0;
    }
 
    // Utility function to check if the stack is full or not
    public Boolean isFull() {
        return top == capacity - 1;     // or return size() == capacity;
    }

}
