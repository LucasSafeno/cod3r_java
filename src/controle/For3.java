package controle;

public class For3 {

	public static void main(String[] args) {
		// para acessar o i fora do laço for, deve iniciar antes do escorpo for
		/*for(int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}
		int i  = 0;
		System.out.println("Saiu do for...");
		System.out.println(i); */
		
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				System.out.printf("[%d  %d]", i, j);
			}
		}

	} // main

} // For3
