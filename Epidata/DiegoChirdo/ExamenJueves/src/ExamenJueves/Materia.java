package ExamenJueves;

import java.time.LocalDate;
import java.util.ArrayList;

public class Materia {
	public String nombre;
	public int cantHoras;
	public String resumen;
	public LocalDate inicio;
	public LocalDate fin;
	public int vacantes;
	public int estudiantes;
	public ArrayList<MateriaCorrelativa> correlativas;
	public boolean esPosgrado;
	public ArrayList<Estudiante> alumnos;
	
	public Materia(String nombre, int cantHoras, String resumen, LocalDate inicio, LocalDate fin, int vacantes, boolean esPosgrado){
		this.nombre = nombre;
		this.cantHoras = cantHoras;
		this.resumen = resumen;
		this.inicio = inicio;
		this.fin = fin;
		this.vacantes = vacantes;
		this.esPosgrado = esPosgrado;
		this.correlativas = new ArrayList<MateriaCorrelativa>();
		this.alumnos = new ArrayList<Estudiante>();
	}
	
	
	public boolean AgregarEstudiante(Estudiante e, Carrera c) {
		
		if(this.estudiantes < this.vacantes && this.inicio.isBefore(LocalDate.now())) {
			if((e.EsEstudianteGrado() && !this.esPosgrado) || (e.EsEstudiantePosgrado() && this.esPosgrado) && c.estudiantes.contains(e)) {
				for(Materia m : e.materiasAprobadas) {
					if(m.nombre == this.nombre) {
						System.out.println("No se pudo agregar al usuario");
						return false;
					}
				}
				this.alumnos.add(e);
				this.estudiantes++;
				System.out.println("Se ha agregado al usuario");
				return true;
			}
		}
		System.out.println("No se pudo agregar al usuario");
		return false;
	}
}
