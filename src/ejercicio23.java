import java.util.Scanner;

public class ejercicio23 {
static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		int numero=0,resultado=0;
		String cadenaParaTerminarPrograma;
		System.out.println("Quieres terminar el programa fin/N");
		cadenaParaTerminarPrograma=teclado.nextLine();		
		while (cadenaParaTerminarPrograma.equals("fin")!=true) {
			numero=leerEntero("Introduce un numero");
			resultado+=sumarNumeros(numero);
			System.out.println("Quieres terminar el programa fin/N");
			cadenaParaTerminarPrograma=teclado.nextLine();
			
		}
		System.out.println("La suma de todos los números es: "+resultado);

	}
public static int sumarNumeros(int numero) {
	int resultado=0;
	resultado+=numero;
	return resultado;
}
public static int leerEntero(String texto) {
	System.out.println("Introduce un numero");
	return Integer.parseInt(teclado.nextLine());
}
}
