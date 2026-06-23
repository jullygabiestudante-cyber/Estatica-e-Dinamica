package dev.julia.queue.exercises;

import dev.julia.queue.queue.linkedqueue.LinkedQueue;

public class ExercicioTeste4 {

    public static void main(String[] args) {

        LinkedQueue<Integer> fila = new LinkedQueue<>();

        // Inserindo elementos
        fila.push(1);
        fila.push(3);
        fila.push(3);
        fila.push(7);
        fila.push(3);
        fila.push(9);

        // Contando ocorrências
        System.out.println("Ocorrências do 3: " + Exercicio4.contarOcorrencias(fila, 3)); // 3
        System.out.println("Ocorrências do 7: " + Exercicio4.contarOcorrencias(fila, 7)); // 1
        System.out.println("Ocorrências do 99: " + Exercicio4.contarOcorrencias(fila, 99)); // 0

        // Verificando que a fila original não foi destruída
        System.out.println("Fila vazia? " + fila.isEmpty()); // false

        // Testando com fila vazia
        LinkedQueue<Integer> filaVazia = new LinkedQueue<>();
        System.out.println("Ocorrências do 5 em fila vazia: " + Exercicio4.contarOcorrencias(filaVazia, 5)); // 0
    }
}
