package dev.julia.queue.stack.exercicises;

import dev.julia.queue.queue.arrayqueue.ArrayQueue;
import dev.julia.queue.stack.linkedstack.linkedStack;

public class ExercicioStack6 {

    public static boolean isPalindrome(String word) {

        // normaliza a entrada (opcional mas recomendado)
        word = word.toUpperCase();

        ArrayQueue<Character> queue = new ArrayQueue<>(word.length());
        linkedStack<Character> stack = new linkedStack<>();

        // 1. carrega estruturas
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            queue.push(c);
            stack.push(c);
        }

        // 2. comparação fila vs pilha
        while (!queue.isEmpty()) {

            char fromQueue = queue.pop();
            char fromStack = stack.pop();

            if (fromQueue != fromStack) {
                return false;
            }
        }

        return true;
    }


}