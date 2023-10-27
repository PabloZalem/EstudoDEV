package stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class ArrayStack extends Stack<Integer> {
    protected int capacity = 100; // The actual capacity of the stack array
    protected int S[]; // Generic array used to irnplement the stack
    protected int top = -1; // index for the top of the stack

    public ArrayStack() {
        this.capacity = capacity;
        S = new int[capacity];
        this.top = top;
    }

    public int size() {
        return (top + 1);
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public void push(int element) throws StackOverflowError {
        if (size() == capacity) throw new StackOverflowError("Stack is full");
        S[++top] =  element;
    }

    public int top() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException();
        return S[top];
    }

    public Integer pop() throws EmptyStackException {
        int element;
        if (isEmpty()) throw new EmptyStackException();
        element = S[top];
        S[top--] = Integer.parseInt(null); // dereference S[top] for garbage collection.
        return element;
    }

}
