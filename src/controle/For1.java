package controle;

public class For1 {
	public static void main(String[] args) {
		
		for(int contador = 0; contador <= 20; contador += 2) {
			System.out.println("Bom dia!" + contador);
		}
		
		
		int x = 2;
		for(;x<10;) {
			System.out.println("x = " + x);
			x++;
		}
		
		// laço infinito
		/*
		 * for(;;){
		 * 	System.out.println("fim");
		 * }
		 */
		
	} // main()
}// For1
