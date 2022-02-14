package ejerciciosBoletin;

import java.util.Scanner;

public class Ej21CienSiguiente {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int numero;
		System.out.println("Introduzca un numero positivo");
		numero=Integer.parseInt(teclado.nextLine());
		cienSiguientes(numero);
		
		cienSiguientes(3);

	}

	public static String cienSiguientes(int num) {
		int i;
		String validez="";
		
		if (num<=0) {
			validez="Numero Incorrecto";
		}else {
			for (i=num+1;i<=num+100;i++) {
				validez=validez + " "+  String.valueOf(i);
			}
		}
	
	return validez;	
}
}