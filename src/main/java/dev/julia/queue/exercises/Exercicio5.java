package dev.julia.queue.exercises;

import dev.julia.queue.queue.linkedqueue.LinkedQueue;

public class Exercicio5 {
    // O método retorna uma LinkedQueue e recebe duas LinkedQueue
    public static LinkedQueue mergeTwoQueues(LinkedQueue <Integer> lista1, LinkedQueue <Integer> lista2) {
        LinkedQueue <Integer> lista3 = new LinkedQueue();

        // Enquanto NENHUMA das duas filas estiver vazia, fazemos a comparação
        while (!lista1.isEmpty() && !lista2.isEmpty()) {

            // Espiamos (peek) o topo de cada fila para ver quem é menor
            Object elemento1 = lista1.peek();
            Object elemento2 = lista2.peek();

            // Usando o seu Comparable para comparar os dois topos
            if (((Comparable) elemento1).compareTo(elemento2) <= 0) {
                // Se o da lista1 for menor ou igual, ele sai da lista1 e entra na 3
                lista3.push(lista1.pop());
            } else {
                // Se o da lista2 for menor, ele sai da lista2 e entra na 3
                lista3.push(lista2.pop());
            }
        }

        // Se o laço de cima acabou, significa que uma das filas esvaziou.
        // Agora, esvaziamos o que sobrou da lista1 (caso ainda tenha alguém)
        while (!lista1.isEmpty()) {
            lista3.push(lista1.pop());
        }

        // Ou esvaziamos o que sobrou da lista2 (caso ela tenha sido a que sobrou)
        while (!lista2.isEmpty()) {
            lista3.push(lista2.pop());
        }

        // Retorna a terceira fila perfeitamente unificada e ordenada!
        return lista3;
    }
}
