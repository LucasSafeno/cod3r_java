package controle;

import java.util.Scanner;

public class DoWHile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		do {
			System.out.println("Você precisa falar as palavras mágicas : ");
			System.out.println("Quer sair ? ");
			texto = entrada.nextLine();
		}while(texto.equalsIgnoreCase("sair"));
		System.out.println("Obirgado");
		entrada.close();
	} // main()
} // DoWhile
