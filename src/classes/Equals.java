package classes;

import java.util.Date;

public class Equals {

	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nomeString = "Lucas Tenório";
		u1.emailString = "lucas@email.com";
		
		Usuario u2 = new Usuario();
		u2.nomeString = "Lucas Tenório";
		u2.emailString = "lucas@email.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		System.out.println(u2.equals(new Date() ));
		
	}
	
	// falta o hashCode - outra aula
}
