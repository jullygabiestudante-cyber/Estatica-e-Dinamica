package linkedqueue;

public class LinkedQueue<T> implements QueueL<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        T element;
        Node<T> next;

        Node(T element) {
            this.element = element;
            this.next = null;
        }
    }

    public LinkedQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void push(T element) {
        Node<T> novoNode = new Node<>(element);

        if (isEmpty()) {
            head = novoNode;
            tail = novoNode;
        } else {
            tail.next = novoNode;
            tail = novoNode;
        }

        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("Fila vazia");
            return null;
        }

        T removido = head.element;
        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }

        return removido;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }

        return head.element;
    }

    @Override
    public T back() {
        if (isEmpty()) {
            return null;
        }

        return tail.element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void display() {
        Node<T> atual = head;

        System.out.print("Fila atual: [");

        while (atual != null) {
            System.out.print(atual.element);

            if (atual.next != null) {
                System.out.print(", ");
            }

            atual = atual.next;
        }

        System.out.println("]");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> atual = head;

        while (atual != null) {
            sb.append(atual.element);

            if (atual.next != null) {
                sb.append(", ");
            }

            atual = atual.next;
        }

        sb.append("]");
        return sb.toString();
    }
}