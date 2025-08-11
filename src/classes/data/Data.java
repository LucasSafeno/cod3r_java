package classes.data;

public class Data {

	// attributes
	int day;
	int month;
	int year;
	
	Data(){
		day = 1;
		month = 1;
		year = 1970;
	}
	Data(int initialDay, int initialMonth, int initialYear){
		day = initialDay;
		month = initialMonth;
		year = initialYear;
		
	}
	
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", day, month, year);
	}
	
	void imprimirData() {
		System.out.println(obterDataFormatada());
	}
}
