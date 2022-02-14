import java.util.Scanner;

public class ejercicio1 {
	static Scanner teclado= new Scanner (System.in);
	public static void main(String[] args) {
		int asciiValue;
		String imprimir;
		System.out.println("Introduce un Caracter");
		asciiValue=teclado.nextLine().charAt(0);
		if (asciiValue>=65 && asciiValue <=90) {
			imprimir="Letra mayuscula";
		}else if (asciiValue>=97 && asciiValue <=122) {
			imprimir=("Letra minuscula");
		}else if (asciiValue>=48 && asciiValue <=57) {
			imprimir=("Digito entre 0 y 9");
		}else if (asciiValue==44 || asciiValue ==46 || asciiValue==58 ||asciiValue==59) {
			imprimir=("Signo de puntuación");
		}else if (asciiValue==32) {
			imprimir=("Espacio");
		}else if (asciiValue==40 || asciiValue==41 || asciiValue==123 || asciiValue==125){
			imprimir=("Parentesis o llaves");
		}else {
			imprimir=("Otro caracter");
		}
		System.out.println(imprimir);
	}

}
