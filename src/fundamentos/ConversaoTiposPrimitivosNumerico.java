package fundamentos;

public class ConversaoTiposPrimitivosNumerico {
	public static void main(String[] args) {
		// Conversão implicita
		double a = 1;
		System.out.println(a);
		
		// casting / conversão explicita
		float b = (float)1.234588879877897;
		System.out.println(b);
		
		// casting / conversão explicita
		int c = 4; // não armezena o valor e sim o tipo. Logo int > byte
		byte d = (byte)c;
		System.out.println(d);
		
		double e = 1.999;
		int f = (int)e; // ignora a parte quebrada
		System.out.println(f);
		
	}

}
