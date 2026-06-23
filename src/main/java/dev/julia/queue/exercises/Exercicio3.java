package dev.julia.queue.exercises;

public class Exercicio3<T> {

        private T[] array;
        private int capacidade;
        private int count;

        public Exercicio3(int size) {
            this.capacidade = size;
            this.array = (T[]) new Object[capacidade];
            this.count = 0;
        }

    public void push(T element) {
        if (count == capacidade) {
            System.out.println("Fila cheia");
            return;
        }

        array[count] = element;
        count++;
    }

        public T popBack() {
            if (count == 0) {
                System.out.println("Estrutura vazia!");
                return null;
            }

            T element = array[count - 1];
            array[count - 1] = null;
            count--;

            return element;
        }

        public boolean isEmpty() {
            return count == 0;
        }

        public int size() {
            return count;
        }
    }

