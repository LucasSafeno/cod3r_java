package classes.data;

public class Data {

	// attributes
	int day;
	int month;
	int year;
	
	// byte,short, int , long -> 0
	// double, float -> 0.0
	// boolean -> false
	// char '\u0000'
	
	// Objetos -> null
	// String 
	

	
	Data(){
		//day = 1;
		//month = 1;
		//year = 1970;
		this(1,1,1970);
		
		//! Variaveis locais não iniciam com valores padrões (acima)
		//int a;
		//System.out.println(a);
		
	}
	Data(int day, int month, int year){
		this.day = day; 
		this.month = month;
		this.year = year;
		
	}
	
	
	String obterDataFormatada() {
		String formato = "%d/%d/%d"; // variavel local
		return String.format(formato, this.day, month, year);
	}
	
	void imprimirData() {
		System.out.println(obterDataFormatada());
	}
}
