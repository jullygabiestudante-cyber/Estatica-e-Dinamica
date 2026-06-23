package dev.julia.queue.exercises;

import dev.julia.queue.queue.linkedqueue.LinkedQueue;

public class Exercicio6 {
    // O retorno é void porque o próprio método já resolve a exibição
    public void splitEvenOddEImprimir(LinkedQueue<Integer> filaOriginal) {
        LinkedQueue<Integer> filaPares = new LinkedQueue<>();
        LinkedQueue<Integer> filaImpares = new LinkedQueue<>();

        while (!filaOriginal.isEmpty()) {
            Integer numero = filaOriginal.pop();
            if (numero % 2 == 0) {
                filaPares.push(numero);
            } else {
                filaImpares.push(numero);
            }
        }

        // Utiliza o método display que você já possui na sua estrutura
        System.out.println("--- Fila de Pares ---");
        filaPares.display();

        System.out.println("--- Fila de Ímpares ---");
        filaImpares.display();
    }
}
