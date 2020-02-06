package ExamenJueves;

import java.util.ArrayList;

public class Estudiante {
	public int numeroLibreta;
	public String nombre;
	public String apellido;
	public ArrayList<Materia> materiasAprobadas;
	public boolean posgrado;
	
	public Estudiante(int numeroLibreta, String nombre, String apellido, boolean posgrado) {
		this.numeroLibreta = numeroLibreta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.posgrado = posgrado;
		this.materiasAprobadas = new ArrayList<Materia>();
	}
	
	public boolean AprobarMateria(Materia m1) {
		for(Materia e : this.materiasAprobadas) {
			if(e.nombre != m1.nombre)
				this.materiasAprobadas.add(m1);
			return true;
		}
		return false;
	}
	
	public boolean EsEstudianteGrado(){
		if(this.posgrado == true)
			return false;
		else
			return true;
	}
	
	public boolean EsEstudiantePosgrado() {
		return this.posgrado;
	}
}
