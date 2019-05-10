package servlet;

import java.util.ArrayList;

public class Singleton {
	private static Singleton instanciaUnica;
	 
    private Singleton() {}
    ArrayList<Usuario> reservas = new ArrayList<Usuario>();
    Usuario u;
    public static Singleton laconstructora() {
        if (instanciaUnica == null) {
            instanciaUnica = new Singleton();
        }
     
        return instanciaUnica;
    }
    
    public  boolean ingresar(String login, String pass) {
		if(u.ingresar(login, pass)== true) {
			return true;
			
		}
		else {
    	return false;
		}
    }
		
	public void setRegistro(String correo,String password,String tipo) {
		u.setLogin(correo);
		u.setPassword(password);
		u.SetTipoUsuario(tipo);
    	
    }
    
    
}
