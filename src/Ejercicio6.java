import java.util.Scanner;

public class Ejercicio6 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int dia,mes;
		dia=leerNumero("Introduce un dia");
		mes=leerCdena("Introduce un mes");
		System.out.println(sistemaCalefaccion(dia, mes));
		

	}

	public static int leerNumero(String texto) {
		System.out.println("Introduce un dia");
		return Integer.parseInt(teclado.nextLine());
	}

	public static int leerCdena(String texto) {
		System.out.println("Introduce un mes");
		return Integer.parseInt(teclado.nextLine());
	}

	public static String sistemaCalefaccion(int dia, int mes) {
		String estacion;
		if (dia < 1 || dia > 31) {
			estacion = "Error";
		} else if (dia <= 20 && mes==5 ||(mes >= 3 && mes <= 5)) {
			estacion = "Primavera " + "20";
		} else if (dia <= 21 && mes >= 6 && mes <= 9) {
			estacion = "Verano " + "24";
		} else if (dia >= 23 && mes >= 9 && mes <= 12) {
			estacion = "Otoño " + "19";
		} else {
			estacion = "Invierno " + "19";
		}
		return estacion;
	}
}
