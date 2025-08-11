package classes;

public class ProdutoTeste {
	public static void main(String[] args){
			
		Produto p1 = new Produto("Notebook", 200.00);
		//p1.nome = "Notebook";
		//p1.preco = 4356.89;
		//p1.desconto = 0.25;
		
		var p2 = new  Produto();	
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double final_price = p1.preco * (1 - p1.desconto);
		System.out.println(final_price);
		
		double final_price2 = p2.preco * (1 - p2.desconto);
		System.out.println(final_price2);
		
		double avarage_cart = (final_price + final_price2) / 2;
		
		System.out.printf("Média do Carrinho = $%.2f", avarage_cart);
		
	}// main
}// Producttest
