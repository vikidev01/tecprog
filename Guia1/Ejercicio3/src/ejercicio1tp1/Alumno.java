package ejercicio1tp1;

import java.util.Calendar;

public class Alumno {
	private Calendar fechaIns;
	private Persona persona;
	private Carrera carrera;
	
	public Alumno(Calendar fechaIns, Persona persona, Carrera ocarrera) {
		
		if (fechaIns == null || persona == null || carrera == null) {
			throw new RuntimeException("Parametros invalidos");
		}
		
		this.fechaIns = fechaIns;
		this.persona = persona;
		this.carrera = ocarrera;
		
		persona.addAlumno(this);
		carrera.addAlumno(this);
	}
	
	public String toString() {
	
		return persona.toString()+ " - " + 
			this.fechaIns.get(Calendar.DAY_OF_MONTH)+ "/" + 
			this.fechaIns.get(Calendar.MONTH)+ "/" +
			this.fechaIns.get(Calendar.YEAR);
	}
	
	
}
