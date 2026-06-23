package dev.julia.queue.exercises;

public class Exerc01ShipPopTest  {


        public static void main(String[] args) {

            Exerc01ShipPop<Integer> fila = new Exerc01ShipPop<>(5);

            // Inserindo elementos
            fila.push(10);
            fila.push(20);
            fila.push(30);
            fila.push(40);

            System.out.println("Quantidade de elementos: " + fila.size());

            // Removendo
            System.out.println("Removido: " + fila.pop()); // 10
            System.out.println("Removido: " + fila.pop()); // 20
            System.out.println("Removido: " + fila.pop()); // 30
            System.out.println("Removido: " + fila.pop()); // 40

            // Tentando remover da fila vazia
            System.out.println("Removido: " + fila.pop());

            System.out.println("Fila vazia? " + fila.isEmpty());
        }
    }


