package exercicios;

import java.util.Scanner;

public class ExercicioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("Você diz: ");
			valor = entrada.nextLine();
			
		} // while
		
		
		entrada.close();
	}// main()
} // E
