import java.util.Scanner;

public class ejercicio2 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String diaSemana;
		String asignatura = "";
		System.out.println("Introduce un dia de la semana");
		diaSemana = teclado.nextLine();
		switch (diaSemana) {
		case "Lunes": {
			asignatura = "Entorno de desarrollo";
			break;
		}
		case "Martes": {
			asignatura = "Programaci�n";
			break;
		}
		case "Miercoles": {
			asignatura = "FOL";
			break;
		}
		case "Jueves": {
			asignatura = "Sistemas inform�ticos";
			break;
		}
		case "Viernes": {
			asignatura = "Programaci�n";
			break;
		}
		default:
			if (diaSemana == "Sabado" || diaSemana == "Domingo") {
				System.out.println("Descanso");
			} else {
				System.out.println("Error");
			}
			
		}
		System.out.println(asignatura);
	}

}
