package dev.julia.queue.stack.exercicises;

public class ExercicioStack4<T> {

    protected Node<T> top;
    protected int size = 0;

    protected static class Node<T> {
        public T element;
        public Node<T> next;

        public Node(T element) {
            this.element = element;
            this.next = null;
        }
    }

    public void push(T element) {

        // Cria o novo nó
        Node<T> newNode = new Node<>(element);

        // O novo nó aponta para o topo antigo
        newNode.next = top;

        // O novo nó se torna o novo topo
        top = newNode;

        size++;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }

        T removed = top.element;
        top = top.next;
        size--;

        return removed;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }

        return top.element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void display() {

        System.out.print("Topo -> ");

        Node<T> current = top;

        while (current != null) {
            System.out.print(current.element);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }

        System.out.println(" -> null");
    }
}