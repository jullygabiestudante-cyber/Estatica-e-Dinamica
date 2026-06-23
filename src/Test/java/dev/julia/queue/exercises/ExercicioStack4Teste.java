package dev.julia.queue.exercises;

import dev.julia.queue.stack.exercicises.ExercicioStack4;

public class ExercicioStack4Teste {

    public static void main(String[] args) {

        ExercicioStack4<Integer> pilha = new ExercicioStack4<>();

        System.out.println("Pilha vazia? " + pilha.isEmpty());

        // Inserindo elementos
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);

        System.out.println("\nEstado da pilha:");
        pilha.display();

        // Peek
        System.out.println("\nTopo (peek): " + pilha.peek());

        // Pop
        System.out.println("Removido: " + pilha.pop());
        System.out.println("Removido: " + pilha.pop());

        System.out.println("\nEstado da pilha após remoções:");
        pilha.display();

        // Mais inserções
        pilha.push(50);
        pilha.push(60);

        System.out.println("\nEstado final da pilha:");
        pilha.display();

        // Testes finais
        System.out.println("\nTamanho: " + pilha.size());
        System.out.println("Pilha vazia? " + pilha.isEmpty());

        // Esgotando a pilha
        while (!pilha.isEmpty()) {
            System.out.println("Removendo: " + pilha.pop());
        }

        System.out.println("\nApós esvaziar:");
        pilha.display();
    }
}