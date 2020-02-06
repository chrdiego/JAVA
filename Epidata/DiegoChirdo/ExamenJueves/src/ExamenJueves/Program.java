package ExamenJueves;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Program {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		
		Carrera carrera1 = new Carrera("Ingeniería Civil", false);
		Carrera carrera2 = new Carrera("Ingeniería Electrónica", false);
		Carrera carrera3 = new Carrera("Posgrado Medicina", true);
		
		Materia materia1 = new Materia("Matemática I", 20, "Matemática I", LocalDate.of(2020,02,01), LocalDate.of(2020, 12, 19), 20, false);
		MateriaCorrelativa materia2 = new MateriaCorrelativa("Matemática II", 20, "Matemática II", LocalDate.of(2020,8,23), LocalDate.of(2020, 12, 25), 25, true);
		Materia materia3 = new Materia("Biología I", 20, "Biología I", LocalDate.of(2020, 4, 25), LocalDate.of(2020, 11, 19), 20, false);
		MateriaCorrelativa materia4 = new MateriaCorrelativa("Biología II", 20, "Biología II", LocalDate.of(2020, 4, 28), LocalDate.of(2020, 11, 23), 20, true);
		
		Estudiante estudiante1 = new Estudiante(202020, "Juán", "Pérez", false);
		Estudiante estudiante2 = new Estudiante(303030, "María", "Gómez", false);
		Estudiante estudiante3 = new Estudiante(404040, "Roberto", "Juán", false);
		Estudiante estudiante4 = new Estudiante(505050, "Matías", "Sergio", true);
		
		materia2.AgregarCorrelativa(materia1);
		materia4.AgregarCorrelativa(materia3);
		
		
		carrera1.materias.add(materia1);
		carrera1.materias.add(materia2);
		carrera2.materias.add(materia1);
		carrera2.materias.add(materia2);
		carrera3.materias.add(materia3);
		carrera3.materias.add(materia4);
		
		ArrayList<Estudiante> jovenes = new ArrayList<Estudiante>();
		jovenes.add(estudiante1);
		jovenes.add(estudiante2);
		jovenes.add(estudiante3);
		jovenes.add(estudiante4);
		
		ArrayList<Carrera> universidad = new ArrayList<Carrera>();
		universidad.add(carrera1);
		universidad.add(carrera2);
		universidad.add(carrera3);
		
		while(opcion != 4) {
			Menu();
			Scanner sn = new Scanner(System.in);
			opcion = sn.nextInt();
			switch(opcion) {
			case 1: 
				for(Carrera e : universidad) {
					System.out.println("\n\nCARRERA: " + e.nombre);
					System.out.println("MATERIAS: ");
					for(Materia m : e.materias) {
						System.out.println(m.nombre);
						System.out.println("Alumnos: ");
						for(Estudiante x : m.alumnos) {
							System.out.println(x.numeroLibreta + " " + x.apellido);
						}
					}
				}
				break;
			case 2:
				Menu3(jovenes, universidad);
				break;
			case 3:
				Menu4(jovenes, universidad);
				break;
			}
		}
		
	}
	
	public static void Menu() {
		System.out.println("\n\n1) Ver materias de cada carrera");
		System.out.println("2) Inscribir estudiante a carrera");
		System.out.println("3) Inscribir alumno a materia");
		System.out.println("4) Salir\n\n");
	}
	
	public static void Menu3(ArrayList<Estudiante> jovenes, ArrayList<Carrera> universidad) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Seleccione un estudiante: \n");
		int i = 1;
		for(Estudiante e : jovenes) {
			System.out.println(i + ")" + e.numeroLibreta + " " + e.apellido);
			i++;
		}
		int respuesta = sn.nextInt();
		i = 1;
		System.out.println("Seleccione una carrera: \n");
		for(Carrera c : universidad) {
			System.out.println(i + ") " + c.nombre);
			i++;
		}
		int respuesta2 = sn.nextInt();
		universidad.get(respuesta2 - 1).AgregarAlumno(jovenes.get(respuesta - 1)); 
	}
	
	public static void Menu4(ArrayList<Estudiante> jovenes, ArrayList<Carrera> universidad) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Seleccione una carrera: ");
		int i = 1;
		for(Carrera c : universidad) {
			System.out.println(i + ") " + c.nombre);
			i++;
		}
		int respuesta = sn.nextInt();
		Carrera aux = universidad.get(respuesta - 1);
		System.out.println("Seleccione una materia: ");
		i = 1;
		for(Materia m : aux.materias) {
			System.out.println(i + ") " + m.nombre + " " + m.estudiantes + "/" + m.vacantes);
			i++;
		}
		int respuesta2 = sn.nextInt();
		i = 1;
		System.out.println("Seleccione un alumno: ");
		for(Estudiante e : aux.estudiantes) {
			System.out.println(i + ") " + e.apellido);
			i++;
		}
		int respuesta3 = sn.nextInt();
		aux.materias.get(respuesta2 - 1).AgregarEstudiante(aux.estudiantes.get(respuesta3 - 1), universidad.get(respuesta - 1));
	}
}
