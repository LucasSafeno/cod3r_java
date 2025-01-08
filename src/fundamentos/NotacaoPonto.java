package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		double a = 2.3;
		String s = "Bom dia X";
		
		s = s.replace("X", "Lucas");
		s = s.toUpperCase();
		
		s = s.concat("!!!!!");
		
		System.out.println(s);
		
		System.out.println("Lucas".toUpperCase());
		
		String x = "Teste".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".replace("X", "java");
		System.out.println(y);
		
		String z = "Bom dia"
					.replace("Bom", "boa")
					.replace("dia", "tarde")
					.concat("!!!!")
					.toUpperCase();
		System.out.println(z);
		
		
		// Tipos primitivos não tem operador "."
	}
}
