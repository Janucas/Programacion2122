package ejerciciosBoletin;

import java.util.Scanner;

public class Ej23 {

	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {

	}

	public static int contarNumeros() {
		int contador;
		System.out.println("Introduce un numero");
		int num = Integer.parseInt(teclado.nextLine());
		for (contador = 1; num > 0; contador++) {
			System.out.println("Introduce un numero");
			num = Integer.parseInt(teclado.nextLine());
		}
		return contador;
	}
}
