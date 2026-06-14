package dev.julia.queue.exercises;

import dev.julia.queue.queue.arrayqueue.ArrayQueue;
import dev.julia.queue.stack.arraystack.arrayStack;

public class Exercio3 <T> {

     private T Array[];
     private int capacidade;
     private int count = 0;

    public Exercio3(int size) {

        this.capacidade = size;
        this.Array = (T[]) new Object[capacidade];
        count = 0;
    }


    public T popBack(){
     T element = Array[count -1];
     return  element;
        
    }


}
