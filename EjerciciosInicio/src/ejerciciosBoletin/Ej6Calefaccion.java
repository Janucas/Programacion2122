package ejerciciosBoletin;

import java.util.Scanner;

public class Ej6Calefaccion {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Indique en que mes se encuentra (Hagalo indicandolo con un numero)");
		int mes = Integer.parseInt(teclado.nextLine());
		System.out.println("Indique en que dia se encuentra");
		int dia = Integer.parseInt(teclado.nextLine());
		System.out.println(compruebaEstacion(mes, dia));

	}

	public static String compruebaEstacion(int mes, int dia) {
		String estacion;
		// Igualas todos los meses que no tengan limites
		// Los meses con limites le pasas la condicion del dia
		if (mes == 12 || mes == 1 || mes == 2 || (mes == 3 && dia <= 21)) {
			estacion = "Invierno->19º";
		} else if ((mes == 3 && dia >= 21) || mes == 4 || mes == 5 || (mes == 6 && dia <= 21)) {
			estacion = "Primavera->20º";
		} else if ((mes == 6 && dia >= 21) || mes == 7 || mes == 8 || (mes == 9 && dia <= 23)) {
			estacion = "Verano->24º";
		} else {
			estacion = "Otoño→19º";
		}
		return estacion;
	}
}
