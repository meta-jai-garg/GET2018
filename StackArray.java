package question1.stackusingarray;

import question1.StackOperations;

public class StackArray implements StackOperations {
    private int[] elements;
    private int stackTop;

    StackArray(int size) {
        this.elements = new int[size];
        this.stackTop = 0;
    }

    @Override
    public void push(int x) throws StackException {
        if (stackTop == elements.length)
            throw new StackException("Stack Overflow");
        elements[stackTop] = x;
        stackTop++;
    }

    @Override
    public int pop() throws StackException {
        if (stackTop == 0)
            throw new StackException("Stack Underflow");
        return elements[stackTop--];
    }

    int top() throws StackException {
        if (isEmpty())
            throw new StackException("Stack is Empty");
        return elements[stackTop--];
    }

    @Override
    public boolean isEmpty() {
        return stackTop == 0;
    }
}
