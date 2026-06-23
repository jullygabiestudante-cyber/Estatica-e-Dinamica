package dev.julia.queue.exercises;

public class ExercicioTeste2 {

    public static void main(String[] args) {

        Exercicio2<Integer> fila = new Exercicio2<>(5);

        // Inserindo elementos
        fila.push(10);
        fila.push(20);
        fila.push(30);
        fila.push(40);

        // Espiando o topo sem remover
        System.out.println("Peek: " + fila.Peek()); // 10

        // Removendo
        System.out.println("Removido: " + fila.Pop()); // 10
        System.out.println("Removido: " + fila.Pop()); // 20
        System.out.println("Removido: " + fila.Pop()); // 30
        System.out.println("Removido: " + fila.Pop()); // 40

        System.out.println("Fila vazia? " + fila.isEmpty()); // true
    }

}
