package dev.julia.queue.exercises;

import dev.julia.queue.queue.linkedqueue.LinkedQueue;

public class ExercicioTeste5 {
    public static void main(String[] args) {

        // Teste 1: filas intercaladas do mesmo tamanho
        LinkedQueue<Integer> lista1 = new LinkedQueue<>();
        lista1.push(1);
        lista1.push(3);
        lista1.push(5);

        LinkedQueue<Integer> lista2 = new LinkedQueue<>();
        lista2.push(2);
        lista2.push(4);
        lista2.push(6);

        LinkedQueue<Integer> resultado1 = Exercicio5.mergeTwoQueues(lista1, lista2);
        System.out.print("Merge [1,3,5] + [2,4,6]: ");
        resultado1.display(); // esperado: 1 2 3 4 5 6

        // Teste 2: tamanhos diferentes
        LinkedQueue<Integer> lista3 = new LinkedQueue<>();
        lista3.push(1);
        lista3.push(2);

        LinkedQueue<Integer> lista4 = new LinkedQueue<>();
        lista4.push(3);
        lista4.push(4);
        lista4.push(5);

        LinkedQueue<Integer> resultado2 = Exercicio5.mergeTwoQueues(lista3, lista4);
        System.out.print("Merge [1,2] + [3,4,5]: ");
        resultado2.display(); // esperado: 1 2 3 4 5

        // Teste 3: primeira fila vazia
        LinkedQueue<Integer> vazia = new LinkedQueue<>();
        LinkedQueue<Integer> lista5 = new LinkedQueue<>();
        lista5.push(10);
        lista5.push(20);

        LinkedQueue<Integer> resultado3 = Exercicio5.mergeTwoQueues(vazia, lista5);
        System.out.print("Merge [] + [10,20]: ");
        resultado3.display(); // esperado: 10 20

        // Teste 4: segunda fila vazia
        LinkedQueue<Integer> lista6 = new LinkedQueue<>();
        lista6.push(5);
        lista6.push(15);

        LinkedQueue<Integer> resultado4 = Exercicio5.mergeTwoQueues(lista6, new LinkedQueue<>());
        System.out.print("Merge [5,15] + []: ");
        resultado4.display(); // esperado: 5 15
    }
}

