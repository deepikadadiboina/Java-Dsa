package practicejava;

public class Stack {
	    private int arr[];
	    private int top;
	    private int capacity;

	    // Constructor to initialize stack
	    public Stack(int size) {
	        arr = new int[size];
	        capacity = size;
	        top = -1;
	    }

	    // Push element onto stack
	    public void push(int item) {
	        if (isFull()) {
	            System.out.println("Stack Overflow");
	            return;
	        }
	        arr[++top] = item;
	    }

	    // Pop element from stack
	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack Underflow");
	            return -1;
	        }
	        return arr[top--];
	    }

	    // Peek top element
	    public int peek() {
	        if (!isEmpty()) {
	            return arr[top];
	        }
	        System.out.println("Stack is empty");
	        return -1;
	    }

	    // Check if stack is empty
	    public boolean isEmpty() {
	        return top == -1;
	    }

	    // Check if stack is full
	    public boolean isFull() {
	        return top == capacity - 1;
	    }
	}

}
