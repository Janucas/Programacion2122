package ejerciciosBoletin;

import java.util.Scanner;

public class Ej4Calificaciones {
	
	public static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		
		double practica,problemas,teoria,media;
		
		System.out.println("Introduzca la nota de la parte practica");
		practica=Integer.parseInt(teclado.nextLine());
		practica=practica*0.1;
		
		System.out.println("Introduzca la nota de la parte de problemas");
		problemas=Integer.parseInt(teclado.nextLine());
		problemas=problemas*0.5;
		
		System.out.println("Introduzca la nota de la parte teorica");
		teoria=Integer.parseInt(teclado.nextLine());
		teoria=teoria*0.4;
		
		media=(practica+problemas+teoria)/3;
		
		if (media>=0 && media<5) {
			System.out.println("Tienes un Insuficiente");
		}
		else if (media<6) {
			System.out.println(" Tienes un Suficiente");
		}
		else if (media<7) {
			System.out.println("Tienes un Bien");
		}
		else if (media<9) {
			System.out.println("Tienes un Notable");
		}
		else {
			System.out.println("Tienes un Sobresaliente");
		}
		
		System.out.println("Su nota media es un "+ media);
		

	}

}
