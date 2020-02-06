package ExamenJueves;

import java.time.LocalDate;
import java.util.ArrayList;

public class MateriaCorrelativa extends Materia{
	public ArrayList<Materia> correlativasAnteriores;
	
	public MateriaCorrelativa(String nombre, int cantHoras, String resumen, LocalDate inicio, LocalDate fin, int vacantes, boolean esPosgrado) {
		super(nombre, cantHoras, resumen, inicio, fin, vacantes, esPosgrado);
	}
	
	public boolean AgregarCorrelativa(Materia m) {
		for(Materia i : this.correlativas) {
			if(i.nombre != m.nombre) {
				this.correlativasAnteriores.add(m);
				m.correlativas.add(this);
				return true;	
			}
		}
		return false;
	}
	
		public boolean AgregarEstudiante(Estudiante e, Carrera c) {
		if(e.materiasAprobadas.containsAll(this.correlativasAnteriores))
			return super.AgregarEstudiante(e, c);
		return false;
	}
	
	
}
