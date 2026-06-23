package dev.julia.queue.exercises;

import dev.julia.queue.stack.exercicises.ExercicioStack5;

public class ExercicioStack5Teste {

    public static void main(String[] args) {

        ExercicioStack5<Integer> pilha = new ExercicioStack5<>();

        // Inserindo elementos
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(20);
        pilha.push(40);

        System.out.println("Pilha original:");
        pilha.display();

        // Removendo primeira ocorrência do 20
        pilha.removeElement(20);

        System.out.println("\nApós remover 20:");
        pilha.display();

        // Removendo outro elemento
        pilha.removeElement(40);

        System.out.println("\nApós remover 40:");
        pilha.display();
    }
}