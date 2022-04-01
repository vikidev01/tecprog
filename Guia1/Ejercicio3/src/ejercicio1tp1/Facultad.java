package ejercicio1tp1;

import java.util.ArrayList;

public class Facultad {
	private String nombre;
	private ArrayList<Carrera> cCarreras;
	
	public Facultad(String nombre) {
		this.nombre = nombre;
		this.cCarreras= new ArrayList<Carrera> ();
	}
	public void addCarrera(Carrera ocarrera) {
		cCarreras.add(ocarrera);
	}
	public String toString() {
		return "Facultad: " + this.nombre;
	}
	public void mostrarCarrerasyAlumnos() {
		for(int i = 0; i < cCarreras.size(); i++) {
            System.out.println(cCarreras.get(i).toString());
        }
	}
	
}
