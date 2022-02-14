package ejerciciosBoletin;

import java.util.Scanner;

public class Ej22Cuadrado {
	
	public static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
	leerInt("Introduzca un numero");
	int numero=Integer.parseInt(teclado.nextLine());
	System.out.println(cuadrado(numero));

	}
	
	public static int leerInt(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}
	
	public static int cuadrado(int num) {
		int cuadrado=0;
		while (num>=0) {
			cuadrado=num*num;
		}
		return cuadrado;
	}
	
	

}
