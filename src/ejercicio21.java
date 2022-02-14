import java.util.Scanner;

public class ejercicio21 {
static Scanner teclado=new Scanner (System.in);
	public static void main(String[] args) {
		int numero=0,mayor=0;
		numero=leerEntero("Introduce un numero");
		while (numero>0) {
			mayor=numeroMayor(numero);
			numero=leerEntero("Introduce un numero");
		}
		System.out.println(mayor);
	}
public static int numeroMayor(int numero) {
	int mayor=0;
	if (numero>mayor) {
		mayor=numero;
	}
	return mayor;
}
public static int leerEntero(String texto) {
	System.out.println("Introduce un numero");
	return Integer.parseInt(teclado.nextLine());
}
}
