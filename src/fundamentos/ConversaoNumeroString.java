package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		// Converter para string
		Integer num1 = 10000; // converter declarando wrapper
		System.out.println(num1.toString());
		System.out.println(num1.toString().length()); // contar caracteres
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2)); // pode converter declarando tipo primitivo );
		
		System.out.println((""  + num2).length()); // converten para a string - NÃO RECOMENDADO
	}
}
