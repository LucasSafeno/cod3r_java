package classes.data;

public class DataTest {

	public static void main(String[] args) {
		Data d1 = new Data();
		d1.day = 01;
		d1.month = 05;
		d1.year = 2000;
		
		System.out.printf("%d/%d/%d\n", d1.day, d1.month, d1.year);
		
		var d2 = new Data();
		d2.day = 14;
		d2.month = 10;
		d2.year = 1994;
		
		System.out.printf("%d/%d/%d\n", d2.day, d2.month, d2.year);
		
	}
}
