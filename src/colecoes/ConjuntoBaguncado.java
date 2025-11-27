package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double (class)
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); 
		
		// Exibir quantidade de elementos
		System.out.println("Tamanho e : " + conjunto.size());
		
		conjunto.add("teste");
		System.out.println("Tamanho e : " + conjunto.size());
		
		conjunto.add("Teste");
		System.out.println("Tamanho e : " + conjunto.size());
		
		// Remover elementos
		System.out.println(conjunto.remove("Teste"));
		System.out.println("Tamanho e : " + conjunto.size());
		
		// Contains
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(3));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(conjunto);
		System.out.println(nums);
		
		
		System.out.println("========= União (addAll) ======");
		//conjunto.addAll(nums); // União entre dois conjuntos
		
		
		System.out.println("========= União (retainAll) ======");
		conjunto.retainAll(nums); // Interseção
		System.out.println("=========");
		System.out.println(conjunto);
		
		System.out.println("========= Clear ======");
		conjunto.clear();
		System.out.println(conjunto);
		
		
		
		

	}

}
