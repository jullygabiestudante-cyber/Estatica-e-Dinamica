package dev.julia.queue.stack.exercicises;

public class Exercicio3 {



        public static void main(String[] args) {

            Exercicio3<Integer>  estrutura = new Exercicio3(5);

            // Inserindo elementos
            estrutura.push(10);
            estrutura.push(20);
            estrutura.push(30);
            estrutura.push(40);

            // Removendo do final
            System.out.println("Removido: " + estrutura.popBack()); // 40
            System.out.println("Removido: " + estrutura.popBack()); // 30
            System.out.println("Removido: " + estrutura.popBack()); // 20
            System.out.println("Removido: " + estrutura.popBack()); // 10

            // Tentando remover de uma estrutura vazia
            System.out.println("Removido: " + estrutura.popBack()); // null

            System.out.println("Está vazia? " + estrutura.isEmpty());
        }
    }

    }

