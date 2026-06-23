package dev.julia.queue.stack.exercicises;

public class ExercicioStack2<T> {

    private T[] items;
    private int top;

    public ExercicioStack2(int capacidadeInicial) {
        items = (T[]) new Object[capacidadeInicial];
        top = 0;
    }

    // Método responsável por aumentar a capacidade
    private void ensureCapacity() {

        if (top == items.length) {

            T[] novoArray = (T[]) new Object[items.length * 2];

            for (int i = 0; i < top; i++) {
                novoArray[i] = items[i];
            }

            items = novoArray;
        }
    }

    public void push(T element) {

        ensureCapacity();

        items[top] = element;
        top++;
    }

    public T pop() {

        if (isEmpty()) {
            System.out.println("Pilha vazia");
            return null;
        }

        top--;
        T removido = items[top];
        items[top] = null;

        return removido;
    }

    public T peek() {

        if (isEmpty()) {
            System.out.println("Pilha vazia");
            return null;
        }

        return items[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    public void display() {

        System.out.print("Pilha: [");

        for (int i = 0; i < top; i++) {
            System.out.print(items[i]);

            if (i < top - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}

