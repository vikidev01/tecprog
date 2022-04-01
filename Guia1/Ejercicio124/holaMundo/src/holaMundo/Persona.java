package helloWord;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private String apellido;
	private Integer documento;
	private Calendar fechaNacimiento;
	private String password;
	
	public Persona(String nombre, String apellido, Integer documento, String password, Calendar fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
		this.password =StringMD.getStringMessageDigest(password, StringMD.SHA256);
	}
	
	public String getPassword() {
		return this.password;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public Integer getDocumento() {
		return this.documento;
	}
	
	public Calendar getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	public Integer getEdad() {
	
		
		Calendar today = Calendar.getInstance();
		
		
		Integer dayT = today.get(Calendar.DAY_OF_MONTH);
		Integer monthT = today.get(Calendar.MONTH);
		Integer yearT = today.get(Calendar.YEAR);
		
		Integer day = this.fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		Integer month = this.fechaNacimiento.get(Calendar.MONTH);
		Integer year = this.fechaNacimiento.get(Calendar.YEAR);
		
	
		
		if(monthT >= month && day >= dayT) {
			return yearT - year;
		} 
		
		return yearT - year -1; 
	}
	
	public String getDia() {
		
		switch (this.fechaNacimiento.get(Calendar.DAY_OF_MONTH)) {
		
	}
	public mostrarPersona(Persona persona) {
		System.out.println (this.getNombre() + ", "+
							this.getApellido()+ ": "+
							this.getEdad()+
							this.getDia() );
	}
	
	public String validarPassword(String clave) {
		// TODO Auto-generated method stub
		String clave_test = StringMD.getStringMessageDigest(clave StringMD.SHA256);
		if(this.password.equals(clave_test)) {
			return "Verdadero";
		} else {
			return "Falso";
		}
		
	}
}
