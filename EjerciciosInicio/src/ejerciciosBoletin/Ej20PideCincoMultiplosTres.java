package ejerciciosBoletin;

import java.util.Scanner;

public class Ej20PideCincoMultiplosTres {
	
	public static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(multiploDe3());

	}
	
	public static String multiploDe3() {
		int num,i;
		String multiplo="";
		for (i=0;i<5;i++){
			System.out.println("Introduzca un numero");
			num=Integer.parseInt(teclado.nextLine());
			if (num%3==0) {
				multiplo+=("El numero " + num + " Es multiplo de 3\n");
			}else {
				multiplo+=("El numero "+ num+  " No es multiplo de 3\n");
			}
		}
		return multiplo;
	}

}
