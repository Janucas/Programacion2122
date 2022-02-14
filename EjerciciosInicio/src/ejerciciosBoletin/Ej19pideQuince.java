package ejerciciosBoletin;

import java.util.Scanner;

public class Ej19pideQuince {
	
	public static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(sumaQuince());

	}
	
	public static String sumaQuince() {
		int i,num,acum=0;
		String cadenaFinal;
		for (i=0;i<15;i++) {
			System.out.println("Introduzca un numero");
			num=Integer.parseInt(teclado.nextLine());
			acum+=num;
		}
		cadenaFinal="La suma de sus numeros es "+ acum;
		return cadenaFinal;
	}

}
