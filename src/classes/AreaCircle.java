package classes;

public class AreaCircle {

	double raio;
	static double pi = 3.14;
	
	AreaCircle(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return pi * Math.pow(raio,2);
	}
}
