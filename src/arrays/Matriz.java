package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entradaScanner = new Scanner(System.in);
		
		System.out.println("Quantos alunos ? ");
		int qntdAlunos = entradaScanner.nextInt();
		
		System.out.println("Quantas notas por aluno ? ");
		int qntdNotas = entradaScanner.nextInt();
		
		double[][] notasDaTurma = new double[qntdAlunos][qntdNotas];
		
		double notaTotal = 0;
		for(int a = 0; a < notasDaTurma.length; a++)
		{
			for(int n = 0; n <  notasDaTurma[a].length; n++)
			{
				System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1 );
				
				notasDaTurma[a][n] = entradaScanner.nextDouble();
				
				notaTotal += notasDaTurma[a][n];
			}
		}
		
		double media = notaTotal / (qntdAlunos * qntdNotas);
		System.out.println("A média das notas é: " + media);
		
		System.out.println("===== Notas da Turma =====");
		for(double[] notasDoAluno: notasDaTurma)
		{			
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		entradaScanner.close();
	}
}
