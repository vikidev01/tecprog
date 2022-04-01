package ejercicio1tp1;

import java.util.ArrayList;
import java.util.Calendar;

public class Persona {
	private String nombre;
	private Integer documento;
	private Calendar fechaNacimiento;
	private ArrayList<Alumno> cAlumnos;
	
	
	public Persona(String nombre, Integer documento, Calendar fechaNacimiento) {
		this.nombre = nombre;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
		this.cAlumnos = new ArrayList<Alumno> ();
	}
	public void addAlumno(Alumno oalumno) {
		cAlumnos.add(oalumno);
	}
	
	
	public String getNombre() {
		return this.nombre;
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
	}
