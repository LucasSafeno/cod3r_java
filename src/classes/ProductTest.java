package classes;

public class ProductTest {
	public static void main(String[] args){
			
		Product p1 = new Product();
		p1.name = "Notebook";
		p1.price = 4356.89;
		p1.discount = 0.25;
		
		var p2 = new  Product();
		p2.name = "Black Pen";
		p2.price = 12.56;
		p2.price = 0.29;

		
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		double final_price = p1.price * (1 - p1.discount);
		System.out.println(final_price);
		
		double final_price2 = p2.price * (1 - p2.discount);
		System.out.println(final_price2);
		
		double avarage_cart = (final_price + final_price2) / 2;
		
		System.out.printf("Avarage cart = $%.2f", avarage_cart);
		
	}// main
}// Producttest
