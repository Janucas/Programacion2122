import java.util.Scanner;

public class ejercicio4 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		double notaTeorica, notaProblemas, notaPractica, resultado, resultadoNotaTeorica = 0.0,
				resultadoNotaPractica = 0.0, resultadoNotaProblemas = 0.0;
		final int NUMERONOTAS = 3;
		String nota = "";
		// Pedimos las notas
		for (int i = 0; i < NUMERONOTAS; i++) {
			System.out.println("Introduce la nota de la parte Teorica");
			notaTeorica = Double.parseDouble(teclado.nextLine());
			while (notaTeorica < 0 || notaTeorica > 10) {
				System.out.println("Error ");
				System.out.println("Introduce la nota de la parte Teorica");
				notaTeorica = Double.parseDouble(teclado.nextLine());

			}
			resultadoNotaTeorica += notaTeorica;
			System.out.println("Introduce la nota de la parte Práctica");
			notaPractica = Double.parseDouble(teclado.nextLine());
			while (notaPractica < 0 || notaPractica > 10) {
				System.out.println("Error ");
				System.out.println("Introduce la nota de la parte Práctica");
				notaPractica = Double.parseDouble(teclado.nextLine());
			}
			resultadoNotaPractica += notaPractica;
			System.out.println("Introduce la nota de la parte de Problemas");
			notaProblemas = Double.parseDouble(teclado.nextLine());
			while (notaProblemas < 0 || notaProblemas > 10) {
				System.out.println("Error ");
				System.out.println("Introduce la nota de la parte de Problemas");
				notaProblemas = Double.parseDouble(teclado.nextLine());
			}
			resultadoNotaProblemas += notaProblemas;

		}
		resultadoNotaTeorica = (resultadoNotaTeorica / NUMERONOTAS) * 0.1;
		resultadoNotaPractica = (resultadoNotaPractica / NUMERONOTAS) * 0.4;
		resultadoNotaProblemas = (resultadoNotaProblemas / NUMERONOTAS) * 0.5;

		// Sumamos todos los resultados
		resultado = resultadoNotaTeorica + resultadoNotaPractica + resultadoNotaProblemas;
		if (resultado < 5) {
			nota = "Insuficiente";
		} else if (resultado < 6) {
			nota = "Suficiente";
		} else if (resultado < 7) {
			nota = "Bien";
		} else if (resultado < 9) {
			nota = "Notable";
		} else {
			nota = "Sobresaliente";
		}

		System.out.println(nota);
	}

}
