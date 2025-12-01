package colecoes;

import java.util.HashSet;

public class Hash {
    static void main() {
        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Guilherme"));

        boolean resultado = usuarios.contains("Ana");

        System.out.println(resultado);


    }
}
