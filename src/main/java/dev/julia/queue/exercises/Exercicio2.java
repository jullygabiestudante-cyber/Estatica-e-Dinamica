package dev.julia.queue.exercises;

import dev.julia.queue.stack.arraystack.arrayStack;

public class Exercicio2<T>  {


        private arrayStack<Integer> stack1;
        private arrayStack<Integer> stack2;

        public Exercicio2(int size) {
            stack1 = new arrayStack<>(size);
            stack2 = new arrayStack<>(size);
        }

        public void push(int element) {
            stack1.push(element);
        }

        public void Transferir() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
        }

        public int Pop() {
            Transferir();
            return stack2.pop();
        }

        public int Peek() {
            Transferir();
            return stack2.peek();
        }

        public boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }



