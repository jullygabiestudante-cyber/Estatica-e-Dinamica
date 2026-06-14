package dev.julia.queue.exercises;

import dev.julia.queue.stack.arraystack.arrayStack;

public class MyQueue<T> extends arrayStack<T> {

    private arrayStack<Integer> stack1;
    private arrayStack<Integer> stack2 ;


    public MyQueue(int size) {
        super(size);
    }

    public void push(int element) {
        stack1.push(element);
    }

    public void Transferir() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    public int Pop() {
        Transferir();
        return stack2.pop();
    }

    public int Peek() {
        Transferir();
        return stack2.peek();
    }
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

}


