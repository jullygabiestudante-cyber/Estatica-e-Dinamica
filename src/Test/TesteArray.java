package Test;

import arrayQueue.ArrayQueue;

public class TesteArray {

        public static void main(String[] args) {

            ArrayQueue<Integer> fila = new ArrayQueue<>(5);

            System.out.println("Fila vazia? " + fila.isEmpty());

            // Inserindo elementos
            fila.push(10);
            fila.push(20);
            fila.push(30);
            fila.push(40);

            System.out.println("\nApós inserções:");
            fila.display();

            System.out.println("Primeiro elemento: " + fila.peek());
            System.out.println("Último elemento: " + fila.back());
            System.out.println("Tamanho da fila: " + fila.size());

            // Removendo elemento
            System.out.println("\nElemento removido: " + fila.pop());

            System.out.println("\nApós remoção:");
            fila.display();

            System.out.println("Primeiro elemento: " + fila.peek());
            System.out.println("Último elemento: " + fila.back());
            System.out.println("Tamanho da fila: " + fila.size());

            // Inserindo mais elementos
            fila.push(50);
            fila.push(60);

            System.out.println("\nApós novas inserções:");
            fila.display();

            // Tentando inserir com a fila cheia
            fila.push(70);

            // Esvaziando a fila
            System.out.println("\nRemovendo todos os elementos:");

            while (!fila.isEmpty()) {
                System.out.println("Removido: " + fila.pop());
                fila.display();
            }

            System.out.println("\nFila vazia? " + fila.isEmpty());

            // Limpando a fila
            fila.clear();

            System.out.println("Tamanho após clear(): " + fila.size());
        }
    }

