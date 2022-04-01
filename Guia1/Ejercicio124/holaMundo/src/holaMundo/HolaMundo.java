package helloWord;

import java.util.Calendar;

public class HelloWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar fn = Calendar.getInstance();
		fn.set(1998, 01, 22);
		
		Persona persona = new Persona("Victoria","Galarza", 41007468,"pass",  fn);
		
		mostrarPersona(persona);
		
		
		System.out.println(persona.validarPassword("pass"););
	
	}

}