package ejercicio1tp1;

import java.util.Calendar;

public class main {

	public static void main(String[] args) {
		Facultad fich= new Facultad ("Facultad de Ingeniería y Ciencias Hídricas");
		Carrera ii = new Carrera ("Ingeniería en Informática");
		Calendar fechanac = Calendar.getInstance();
		fechanac.set(1998, 01, 22);
		Persona mia = new Persona ("Victoria Galarza", 41007468, fechanac );
		Calendar ins = Calendar.getInstance();
		ins.set(2019, 02, 12);
		Alumno yo = new Alumno(ins, mia, ii);
		
		ii.addAlumno(yo);
		fich.addCarrera(ii);
		
		
		System.out.println(fich.toString());
		System.out.println(ii.toString());
		System.out.println(yo.toString());
	
	}

}
