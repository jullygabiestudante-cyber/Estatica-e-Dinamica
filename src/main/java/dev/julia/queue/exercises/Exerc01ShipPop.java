package dev.julia.queue.exercises;

import dev.julia.queue.queue.arrayqueue.ArrayQueue;

public class Exerc01ShipPop<T>  {

        private T[] array;
        private int capacidade;
        private int count;

        public Exerc01ShipPop(int size) {
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

        public T pop() {

            if (isEmpty()) {
                System.out.println("Lista vazia");
                return null;
            }

            T removido = array[0];

            for (int i = 0; i < count - 1; i++) {
                array[i] = array[i + 1];
            }

            array[count - 1] = null;
            count--;

            return removido;
        }

        public boolean isEmpty() {
            return count == 0;
        }

        public int size() {
            return count;
        }
    }

