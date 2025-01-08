package fundamentos;

public class Wrapper {
	public static void main(String[] args) {

		// Scanner entrada = new Scanner(System.in);

		// byte
		Byte b = 100;
		Short s = 1000;
		// Integer.parseInt(entrada.next()); // int
		Integer i = 10000;
		Long l = 1000000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		// entrada.close();
		
		// Float
		Float f = 123.10F;
		System.out.println(f);
		
		// Double
		Double d = 1234.5678;
		System.out.println(d);
		
		// Boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		// Character 
		Character c = '#'; // char
		System.out.println(c.toString());
		
		

	}
}
