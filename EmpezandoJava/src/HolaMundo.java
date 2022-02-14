import java.util.Scanner;

public class HolaMundo {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Declaracion de variables
		int num1, num2;
		char opc;
		int resultado;

		System.out.println("Hola Mundo");

		System.out.println("¿Quieres realizar la suma?");
		opc = teclado.nextLine().charAt(0);
		if (opc == 's') {
			System.out.println("Introduce un numero entero");
			num1 = Integer.parseInt(teclado.nextLine());

			System.out.println("Introduce un numero entero");
			num2 = Integer.parseInt(teclado.nextLine());

			resultado = num1 + num2;
			System.out.println(resultado);

		}else if (opc=='n'){
			System.out.println("Entonces por que me ejecutas");
		}else {
			System.out.println("Error en la opcion");
		}

	}

}


//Programa que lea dos numeros y diga cual es mayor y cual es menor
//Calculadora que pregunte que operacion quieres realizar y te de la opcion de realizar las 4 operaciones