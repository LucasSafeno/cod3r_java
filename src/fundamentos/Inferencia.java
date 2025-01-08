package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		/*
		 * Deve sempre iniciar pois assim que o java inputa o tipo da variavel
		 * não pode mudar o tipo de variavel
		 * ex :
		 * var texto = "Texto";
		 * var texto = 1
		 */
		double a  = 4.5;
		System.out.println(a);
		
		var b =  4.5;
		System.out.println(b);
		
		var c = "Lucas Tenório";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
	}
}
