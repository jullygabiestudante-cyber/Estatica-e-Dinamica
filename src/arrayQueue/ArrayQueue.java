package arrayQueue;

public class ArrayQueue<T> implements Queue<T> {

    private T[] Array;
    private int capacidade;
    private int count;


    public ArrayQueue(int size) {
        this.capacidade = size;
        this.Array = (T[]) new Object[capacidade];
        count = 0;
    }

    @Override

    public void push(T element) {
        if (isFull()) {
            System.out.println("Fila cheia");
                return;
        }
        Array[count++] = element;
    }

    @Override
    public T pop() {

        if (isEmpty()) {
            System.out.println("Lista vazia");
            return null;
        }

        T removido = Array[0];

        for (int i = 0; i < count - 1; i++) {
            Array[i] = Array[i + 1];
        }

        Array[count - 1] = null;
        count--;

        return removido;
    }
    @Override
    public T peek() {
        T primeiro = Array[0];
        return primeiro;

    }

    @Override
    public T back() {
        if (isEmpty()) {
            System.out.printf("Lista Vazia");
            return null;
        }

        T ultimo = Array[count - 1];

        return ultimo;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (count == capacidade) {

            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < count; i++) {
            Array[i] = null;
        }
        this.count = 0;
    }

    public void display() {
        System.out.print("Fila atual: [");

        for (int i = 0; i < count; i++) {
            System.out.print(Array[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

}

