package question1;

import question1.stackusingarray.StackException;

public interface StackOperations {
    void push(int x) throws StackException;

    int pop() throws StackException;

    boolean isEmpty();
}
