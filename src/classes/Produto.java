package classes;

public class Produto {

	// attributes
	String nome;
	double preco;
	static double desconto = 0.25;
	
	
	// Construtores
	Produto()
	{
		
	}
	
	Produto(String nomeInicial)
	{
		nome = nomeInicial; 
	}
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;

	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoGerente) {
			return preco * (1 - desconto * descontoGerente);
	}
	
	
}
