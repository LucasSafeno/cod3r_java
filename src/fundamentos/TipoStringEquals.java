package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.next();
		
		// trim retira os espaços
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}
}
