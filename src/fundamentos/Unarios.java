package fundamentos;

public class Unarios{
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		
		// Forma pos fixada
		a++; // a = a + 1
		a--; // a = a - 1
		
		// forma pré-fixada
		++b;
		--b;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini desafio....");
		System.out.println(++a == b--);
		System.out.println(a);
		System.out.println(b);
	}
}