import java.util.Scanner;

public class Calculadora {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		//Declaracion de las variables
		int n1,n2;
		int resultado;
		char tipo;
		
		//Se le pide al usuario que elija un tipo de operacion
		System.out.println("Indique que tipo de operacion desea realizar (+,-,x,%)");
		tipo=teclado.nextLine().charAt(0);
		
		//Se piden los numeros para realizar la operacion
		System.out.println("Introduzca un numero");
		n1=Integer.parseInt(teclado.nextLine());
		System.out.println("Introduzca otro numero");
		n2=Integer.parseInt(teclado.nextLine());
		
		//Condicional con el cual vamos a poder realizar una operacion u otra
		if (tipo=='+') {
			resultado=n1+n2;
			System.out.println("La suma de "+ n1 + " + " + n2 + " es "+ resultado);
		}else if (tipo=='-') {
			resultado=n1-n2;
			System.out.println("La resta de "+ n1 + " - " + n2 + " es "+ resultado);
		}else if (tipo=='x') {
			resultado=n1*n2;
			System.out.println("La multiplicacion de "+ n1 + " x " + n2 + " es "+ resultado);
		}else if (tipo=='%')  {
			resultado=n1/n2;
			System.out.println("La division de "+ n1 + " % " + n2 + " es "+ resultado);
		}else {
			System.out.println("Caracter incorrecto");
		}
		
		
		
		

	}

}
