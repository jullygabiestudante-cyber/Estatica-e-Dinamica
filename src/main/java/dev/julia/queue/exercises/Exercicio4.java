package dev.julia.queue.exercises;

import dev.julia.queue.queue.linkedqueue.LinkedQueue;

public class Exercicio4 {
    public static <T> int contarOcorrencias(LinkedQueue<T> filaOriginal, T target) {
        int contador = 0;

        // Criamos a nossa fila auxiliar/temporária
        LinkedQueue<T> filaAuxiliar = new LinkedQueue<>();

        // PASSO 1: Esvazia a original, conta e joga na auxiliar
        while (!filaOriginal.isEmpty()) {
            T elementoAtual = filaOriginal.pop(); // Tira da original e lê o valor

            // Se for o que estamos buscando, conta +1
            if (elementoAtual.equals(target)) {
                contador++;
            }

            // Salva na fila auxiliar para não perder o elemento
            filaAuxiliar.push(elementoAtual);
        }

        // PASSO 2: Devolve todo mundo da auxiliar para a original
        while (!filaAuxiliar.isEmpty()) {
            T elementoVolta = filaAuxiliar.pop();
            filaOriginal.push(elementoVolta); // Coloca de volta na original
        }

        // PASSO 3: Retorna a contagem
        return contador;
    }
}
