package colecoes;

import java.util.ArrayList;


public class Lista {
	
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Lucas");
		
		lista.add(u1);
		
		lista.add(new Usuario("Thauanna"));
		lista.add(new Usuario("Eysis"));
		lista.add(new Usuario("Matheus"));
		lista.add(new Usuario("Daniel"));
		
		System.out.println(lista.get(3));
		
		lista.remove(1);
		lista.remove(new Usuario("Daniel"));
		
		System.out.println("====================");
		
		System.out.println("Contém :  "+lista.contains(new Usuario("Eysis")));
		
		System.out.println("====================");
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
		
	}

}
