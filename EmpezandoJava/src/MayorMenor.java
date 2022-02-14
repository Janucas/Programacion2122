import java.util.Scanner;
//Programa que lea dos numeros y diga cual es mayor y cual es menor

public class MayorMenor {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int num1,num2;
		
		System.out.println("Introduzca un numero");
		num1=Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduzca otro numero");
		num2=Integer.parseInt(teclado.nextLine());
		
		if (num1>num2) {
			System.out.println("El numero "+ num1 + " es mayor que "+ num2);
		}else if (num1==num2){
			System.out.println("Ambos numeros son del mismo tamaño");
		}else {
			System.out.println("El numero "+ num2 + " es mayor que "+ num1);
		}

	}

}
