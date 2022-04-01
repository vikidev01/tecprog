package ejercicio1tp1;

import java.util.ArrayList;

public class Carrera {
	private String nombre;
	private ArrayList<Alumno> cAlumnos;
	
	public Carrera(String nombre) {
		this.nombre = nombre;
		this.cAlumnos = new ArrayList<Alumno>();
	}
	public void addAlumno(Alumno oalumno) {
		cAlumnos.add(oalumno);
	}
	
	public String toString() {
		return "Carrera: "+ this.nombre;
	}
	
	public void MostrarAlumnos() {
		for(int i = 0; i < cAlumnos.size(); i++) {
            System.out.println(cAlumnos.get(i).toString());
        }
	}
	
	
	
}
