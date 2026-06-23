package dev.julia.queue.exercises;

import dev.julia.queue.stack.exercicises.DualStack;

public class DualStackTeste {

    public static void main(String[] args) {

        DualStack<Integer> pilhas = new DualStack<>(10);

        // Pilha A
        pilhas.pushA(10);
        pilhas.pushA(20);
        pilhas.pushA(30);

        // Pilha B
        pilhas.pushB(100);
        pilhas.pushB(200);
        pilhas.pushB(300);

        pilhas.display();

        System.out.println("Topo A: " + pilhas.peekA());
        System.out.println("Topo B: " + pilhas.peekB());

        System.out.println("Removido A: " + pilhas.popA());
        System.out.println("Removido B: " + pilhas.popB());

        pilhas.display();
    }
}