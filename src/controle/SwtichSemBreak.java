package controle;

public class SwtichSemBreak {
	public static void main(String[] args)
	{
		
		// if(bool)
		// while(bool)
		// for(;bool;)
		String faixa = "amarela";
		
		switch(faixa)
		{
			case "preta":
				System.out.println(("sei o Bassai-Dai..."));
			case "marrom":
				System.out.println("Sei o Tekki shodan");
			case "roxa":
				System.out.println("Sei o heian Godan");
			case "verde":
				System.out.println("Sei o que Heian Yodan");
			case "laranja":
				System.out.println("Sei o que Heian Sandan");
			case "vermelha":
				System.out.println("Sei o Heia Nidan");
			case "amarela":
				System.out.println("Sei o que Heian Shodan");
				default:
					System.out.println("Não sei de nada");
		}
		
		System.out.println("Fim!");
	}

}
