package classes.data;

public class DataTest {

	public static void main(String[] args) {
		Data d1 = new Data();
		d1.year = 1994;
		
		System.out.println(d1.obterDataFormatada());
		
		var d2 = new Data(31,12, 2025);
		
		
		String dataFormatada = d2.obterDataFormatada()		;
		System.out.println(dataFormatada);
		
	}
}
