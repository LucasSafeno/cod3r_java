package classes.data;

public class Data {

	// attributes
	int day;
	int month;
	int year;
	
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", day, month, year);
	}
	
	void imprimirData() {
		System.out.println(obterDataFormatada());
	}
}
