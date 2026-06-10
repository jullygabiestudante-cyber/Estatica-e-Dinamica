package Test;

import linkedqueue.LinkedQueue;

public class TesteLinked {

        public static void main(String[] args) {

            LinkedQueue<Integer> fila = new LinkedQueue<>();

            System.out.println("Fila vazia? " + fila.isEmpty());

            fila.push(10);
            fila.push(20);
            fila.push(30);
            fila.push(40);

            fila.display();

            System.out.println("Primeiro elemento: " + fila.peek());
            System.out.println("Último elemento: " + fila.back());
            System.out.println("Tamanho: " + fila.size());

            System.out.println("\nRemovendo: " + fila.pop());

            fila.display();

            System.out.println("Primeiro elemento: " + fila.peek());
            System.out.println("Último elemento: " + fila.back());
            System.out.println("Tamanho: " + fila.size());

            fila.clear();

            System.out.println("\nApós clear:");
            fila.display();

            System.out.println("Fila vazia? " + fila.isEmpty());
        }
    }

