import java.util.Scanner;

public class NotasVariosAlumnos {

	static Scanner teclado = new Scanner(System.in);

	// Programa que solicite al usuario tres notas y muestre la calificacion final.
	// A continuacion debe
	// preguntar si quiere introducir otra nota o no, si dice que si (s) se debera
	// pedir a continuacion
	// las tres notas del alumno. El programa terminara cuando responda que no
	// quiere introducir mas notas (n)

	public static void main(String[] args) {

		double practica, examen, problema, nota_media;
		char continua;

		do {
			System.out.println("Introduzca la nota de la parte practica");
			practica = Double.parseDouble(teclado.nextLine());
			System.out.println("Introduzca la nota de la parte de examenes");
			examen = Double.parseDouble(teclado.nextLine());
			System.out.println("Introduzca la nota de la parte de problemas");
			problema = Double.parseDouble(teclado.nextLine());
			nota_media=media(practica,problema,examen);
			System.out.println("La media de sus notas es " + nota_media);
			

			System.out.println("Quieres introducir alguna nota mas (s/n)");
			continua = teclado.nextLine().charAt(0);

		} while (continua != 'n' && continua != 'N');
	}

	public static double media(double nota_practica, double nota_problema, double nota_examen) {
		double resultado = 0.1 * nota_practica + 0.5 * nota_examen + 0.4 * nota_problema;
		return resultado;
	}

}
