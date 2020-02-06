package ExamenJueves;

import java.util.ArrayList;

public class Carrera {
	public String nombre;
	public ArrayList<Materia> materias;
	public ArrayList<Estudiante> estudiantes;
	public boolean esPosgrado;
	
	public Carrera(String nombre, boolean esPosgrado) {
		this.materias = new ArrayList<Materia>();
		this.estudiantes = new ArrayList<Estudiante>();
		this.esPosgrado = esPosgrado;
		this.nombre = nombre;
	}
	
	public boolean AgregarAlumno(Estudiante e) {
		for(Estudiante a : this.estudiantes) {
			if(this.estudiantes.contains(e) &&  !(this.esPosgrado &&  e.EsEstudiantePosgrado()) || !(!this.esPosgrado && e.EsEstudianteGrado())) {
				System.out.println("No se ha podido agregar el alumno (puede que ya exista)");
				return false;
			}
		}
		this.estudiantes.add(e);
		System.out.println("\nEl alumno se ha inscrito en la carrera.");
		System.out.println("Estudiantes ya inscritos: ");
		for(Estudiante a : this.estudiantes) {
			System.out.println(a.nombre);
		}
		return true;
	}
}
