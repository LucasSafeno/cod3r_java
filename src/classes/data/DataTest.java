package classes.data;

public class DataTest {

	public static void main(String[] args) {
		Data d1 = new Data();
		d1.day = 01;
		d1.month = 05;
		d1.year = 2000;
		
		System.out.println(d1.obterDataFormatada());
		
		var d2 = new Data();
		d2.day = 14;
		d2.month = 10;
		d2.year = 1994;
		
		String dataFormatada = d2.obterDataFormatada()		;
		System.out.println(dataFormatada);
		
	}
}
