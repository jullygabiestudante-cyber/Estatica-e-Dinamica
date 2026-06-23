package dev.julia.queue.stack;

public interface Stack <T>{

        void push(T element);    // Insere um elemento no fim da fila (enqueue).
        T pop();                // Remove e retorna o elemento que está no início da fila (dequeue).
        T peek();               // Retorna, sem remover, o elemento que está no início (frente) da fila.;               // Retorna, sem remover, o elemento que está no fim (cauda) da fila.
        int size();
        boolean isEmpty();
        void clear();
        void display();

    }

