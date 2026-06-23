package dev.julia.queue.stack.exercicises;

import dev.julia.queue.queue.arrayqueue.ArrayQueue;

public class ExercicioStack1<T> {

    private int quantidade = 0;
    private ArrayQueue<T> fila1;
    private ArrayQueue<T> fila2;

    public ExercicioStack1(int size) {
        fila1 = new ArrayQueue<>(size);
        fila2 = new ArrayQueue<>(size);
    }

    public void push(T element) {
        fila1.push(element);
        quantidade++;
    }

    public T pop() {

        if (isEmpty()) {
            return null;
        }

        while (fila1.size() > 1) {
            fila2.push(fila1.pop());
        }

        T removido = fila1.pop();
        quantidade--;

        ArrayQueue<T> aux = fila1;
        fila1 = fila2;
        fila2 = aux;

        return removido;
    }

    public T peek() {

        if (isEmpty()) {
            return null;
        }

        while (fila1.size() > 1) {
            fila2.push(fila1.pop());
        }

        T topo = fila1.pop();
        fila2.push(topo);

        ArrayQueue<T> aux = fila1;
        fila1 = fila2;
        fila2 = aux;

        return topo;
    }

    public boolean isEmpty() {
        return quantidade == 0;
    }

    public int size() {
        return quantidade;
    }
}









