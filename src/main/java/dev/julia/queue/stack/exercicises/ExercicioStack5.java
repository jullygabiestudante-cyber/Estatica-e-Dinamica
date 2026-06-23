package dev.julia.queue.stack.exercicises;

import dev.julia.queue.stack.linkedstack.linkedStack;

public class ExercicioStack5<T> {

    private linkedStack<T> stack = new linkedStack<>();

    // acesso opcional caso queira usar a pilha externamente
    public linkedStack<T> getStack() {
        return stack;
    }

    public void push(T element) {
        stack.push(element);
    }

    public T pop() {
        return stack.pop();
    }

    public T peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }


    public void removeElement(T target) {

        linkedStack<T> aux = new linkedStack<>();
        boolean removed = false;

        // 1. esvazia a pilha original
        while (!stack.isEmpty()) {

            T current = stack.pop();

            // remove apenas a primeira ocorrência
            if (!removed && (current == null ? target == null : current.equals(target))) {
                removed = true;
                continue;
            }

            aux.push(current);
        }

        // 2. restaura mantendo ordem
        while (!aux.isEmpty()) {
            stack.push(aux.pop());
        }
    }

    public void display() {
        stack.display();
    }
}