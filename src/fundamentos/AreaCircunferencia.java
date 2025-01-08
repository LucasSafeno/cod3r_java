package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		// Variavel java : tipo + nome + valor
		double raio = 3.4;
		
		// constante : final tipo + nome + valor
		// convensão usar nome de constantes em caixa alta/ Maisculo
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + "m2");
		
	}
}
