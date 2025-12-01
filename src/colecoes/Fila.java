package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();

        // Offer e Add -> Adiciona elementos na fila.
        // A Diferença de comportamento quando a fila está cheia
        fila.add("Lucas");
        fila.offer("Thauanna");
        fila.add("Eysis");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        System.out.println(fila.peek()); // retorna null quando fila está vazia
        System.out.println("================");
        System.out.println(fila.element()); // // retorna exceção

        System.out.println("================");
        // fila.size();
        // fila.clear();
        // file.isEmpty();
        System.out.println(fila.poll()); // Pega o primeiro elemento da fila removendo
        System.out.println(fila);
        System.out.println(fila.poll()); // Pega o primeiro elemento da fila removendo
        System.out.println(fila);
    }
}
