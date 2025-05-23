package desafios;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		// enquanto não digitar -1, não sai do while
		while(nota != -1)
		{
			System.out.println("Informe a nota: ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0)
			{
				total += nota;
				quantidadeDeNotas++;
			}else if(nota != -1){
				System.out.println("Nota inválida");
			}
			
		} // while
		
		// calcular a média
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);

		entrada.close();
		
	}

}
