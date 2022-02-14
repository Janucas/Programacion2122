package ejerciciosBoletin;

import java.util.Scanner;

public class Ej2DiaAsignatura {
	
	public static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		String dia;
		
		System.out.println("Indique sobre que dia de la semana quieres conocer la asignatura de primera hora");
		dia=teclado.nextLine();
		
		switch (dia){
			case "Lunes":
				System.out.println("El lunes a primera hora tienes Entornos de Desarrollo");
				break;
			case "Martes":
				System.out.println("El martes a primera hora tienes Programacion");
				break;
			case "Miercoles":
				System.out.println("El miercoles a primera hora tienes Base de Datos");
				break;
			case "Jueves":
				System.out.println("El jueves a primera hora tienes Lenguaje de Marcas");
				break;
			case "Viernes":
				System.out.println("El viernes a primera hora tienes Programacion");
				break;
			default:
				System.out.println("Introduce una opcion correcta");
		
		}
		
}
}
