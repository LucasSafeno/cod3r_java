package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    static void main() {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Lucas");
        usuarios.put(2, "Tenório");
        usuarios.put(3, "Thauanna");
        usuarios.put(4, "Eysis");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(1));
        System.out.println(usuarios.containsValue("Lucas"));

        System.out.println(usuarios.get(4));


        // Percorrer apenas chaves
        for(int chave : usuarios.keySet()){
            System.out.println(chave);
        }

        // Percorrer por valor
        for(String valor: usuarios.values()){
            System.out.println(valor);
        }

        // Percorrer por chave e valor
        for(Map.Entry<Integer, String> registro : usuarios.entrySet()){
            System.out.print(registro.getKey() + " ");
            System.out.println(registro.getValue());
        }

    }
}
