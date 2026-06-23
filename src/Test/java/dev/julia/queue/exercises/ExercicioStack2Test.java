package dev.julia.queue.exercises;

import dev.julia.queue.stack.exercicises.ExercicioStack2;

public class ExercicioStack2Test {

    public static void main(String[] args) {

        ExercicioStack2<Integer> pilha = new ExercicioStack2<>(3);

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        pilha.display();

        // Aqui a pilha está cheia.
        // O push chamará ensureCapacity() e dobrará a capacidade para 6.
        pilha.push(40);
        pilha.push(50);

        pilha.display();

        System.out.println("Topo: " + pilha.peek());

        System.out.println("Removido: " + pilha.pop());
        System.out.println("Removido: " + pilha.pop());

        pilha.display();

        System.out.println("Tamanho: " + pilha.size());
    }
}