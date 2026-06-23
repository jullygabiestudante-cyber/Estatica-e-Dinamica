package dev.julia.queue.stack.exercicises;

public class DualStack<T> {

    private T[] vetor;
    private int topA;
    private int topB;

    public DualStack(int tamanho) {
        vetor = (T[]) new Object[tamanho];
        topA = -1;
        topB = tamanho;
    }

    // Inserção na Pilha A
    public void pushA(T element) {

        if (topA + 1 == topB) {
            System.out.println("Stack Overflow");
            return;
        }

        vetor[++topA] = element;
    }

    // Inserção na Pilha B
    public void pushB(T element) {

        if (topA + 1 == topB) {
            System.out.println("Stack Overflow");
            return;
        }

        vetor[--topB] = element;
    }

    // Remoção da Pilha A
    public T popA() {

        if (topA == -1) {
            System.out.println("Pilha A vazia");
            return null;
        }

        T removido = vetor[topA];
        vetor[topA] = null;
        topA--;

        return removido;
    }

    // Remoção da Pilha B
    public T popB() {

        if (topB == vetor.length) {
            System.out.println("Pilha B vazia");
            return null;
        }

        T removido = vetor[topB];
        vetor[topB] = null;
        topB++;

        return removido;
    }

    public T peekA() {
        if (topA == -1) {
            return null;
        }

        return vetor[topA];
    }

    public T peekB() {
        if (topB == vetor.length) {
            return null;
        }

        return vetor[topB];
    }

    public boolean isEmptyA() {
        return topA == -1;
    }

    public boolean isEmptyB() {
        return topB == vetor.length;
    }

    public void display() {

        System.out.print("Vetor: [");

        for (int i = 0; i < vetor.length; i++) {

            System.out.print(vetor[i]);

            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}