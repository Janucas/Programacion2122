import java.util.Scanner;

public class ejercicio20 {
static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		int cont=0,numero=leerEntero("Introduce un numero");
		while (numero>0) {
			cont=numeroNumeros(numero);
			cont++;
			numero=leerEntero("Introduce un numero");
		}
		System.out.println(cont);

	}
public static int numeroNumeros(int numero) {
	int cont=0;
	cont+=numero;
	return cont;
}
public static int leerEntero(String texto) {
	System.out.println("Introduce un numero");
	return Integer.parseInt(teclado.nextLine());
}
}
