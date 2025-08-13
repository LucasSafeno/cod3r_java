package classes;

public class Usuario {

	String nomeString;
	String emailString;
	
	public boolean equals(Object objeto)
	{
		if(objeto instanceof Usuario) {
		Usuario outroUsuario = (Usuario) objeto;
		
		boolean nome = outroUsuario.nomeString.equals(this.nomeString);
		boolean email = outroUsuario.emailString.equals(this.emailString);
		
		return nome && email;
		}
		
		return false;
	}// Equals
	
	// falta hashCode - outra aula
	

	public int hashCode() {
	
		return this.nomeString.length();
	}// hashCode
}

