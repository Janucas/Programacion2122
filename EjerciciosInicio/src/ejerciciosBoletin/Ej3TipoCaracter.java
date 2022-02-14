package ejerciciosBoletin;

import java.util.Scanner;

public class Ej3TipoCaracter {
	
	public static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		char tipo;
		
		System.out.println("Introduzca el caracter que desee");
		tipo=teclado.nextLine().charAt(0);
		
		if (tipo>=65 && tipo <=90) {
			System.out.println("Es una letra mayuscula");
		}
		else if (tipo>=65 && tipo <=122) {
			System.out.println("Es una letra minuscula");
		}
		else if (tipo>=48 && tipo <=57) {
			System.out.println("Es un numero entre 0 y 9");
		}
		else if (tipo==44 || tipo ==41 || tipo==123 || tipo==125) {
			System.out.println("Es un parentesis o una llave");
		}
		else {
			System.out.println("Es otro caracter");
		}
		
		

	}

}
