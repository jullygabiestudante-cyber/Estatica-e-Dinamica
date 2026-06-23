package dev.julia.queue.exercises;

import dev.julia.queue.queue.linkedqueue.LinkedQueue;

public class ExercicioTeste6 {
    public static void main(String[] args) {

        Exercicio6 ex = new Exercicio6();

        // Teste 1: mix de pares e ímpares
        LinkedQueue<Integer> fila1 = new LinkedQueue<>();
        fila1.push(1);
        fila1.push(2);
        fila1.push(3);
        fila1.push(4);
        fila1.push(5);
        fila1.push(6);

        System.out.println("=== Teste 1: [1, 2, 3, 4, 5, 6] ===");
        ex.splitEvenOddEImprimir(fila1);
        // esperado -> Pares: 2 4 6 | Ímpares: 1 3 5

        // Teste 2: somente pares
        LinkedQueue<Integer> fila2 = new LinkedQueue<>();
        fila2.push(2);
        fila2.push(4);
        fila2.push(6);

        System.out.println("=== Teste 2: [2, 4, 6] ===");
        ex.splitEvenOddEImprimir(fila2);
        // esperado -> Pares: 2 4 6 | Ímpares: (vazia)

        // Teste 3: somente ímpares
        LinkedQueue<Integer> fila3 = new LinkedQueue<>();
        fila3.push(1);
        fila3.push(3);
        fila3.push(5);

        System.out.println("=== Teste 3: [1, 3, 5] ===");
        ex.splitEvenOddEImprimir(fila3);
        // esperado -> Pares: (vazia) | Ímpares: 1 3 5

        // Teste 4: fila vazia
        LinkedQueue<Integer> fila4 = new LinkedQueue<>();

        System.out.println("=== Teste 4: [] ===");
        ex.splitEvenOddEImprimir(fila4);
        // esperado -> Pares: (vazia) | Ímpares: (vazia)
    }
}
