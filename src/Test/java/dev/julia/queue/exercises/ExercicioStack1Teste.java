package dev.julia.queue.exercises;

import dev.julia.queue.stack.exercicises.ExercicioStack1;

public class ExercicioStack1Teste {

    public static void main(String[] args) {

        ExercicioStack1<Integer> pilha = new ExercicioStack1<>(10);

        System.out.println("Pilha vazia? " + pilha.isEmpty());

        // Inserindo elementos
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Tamanho da pilha: " + pilha.size());

        // Consultando o topo
        System.out.println("Topo da pilha: " + pilha.peek());

        // Removendo elementos
        System.out.println("Elemento removido: " + pilha.pop());
        System.out.println("Elemento removido: " + pilha.pop());

        // Inserindo mais um elemento
        pilha.push(40);

        System.out.println("Topo da pilha: " + pilha.peek());

        // Removendo os restantes
        System.out.println("Elemento removido: " + pilha.pop());
        System.out.println("Elemento removido: " + pilha.pop());

        System.out.println("Pilha vazia? " + pilha.isEmpty());
    }
}