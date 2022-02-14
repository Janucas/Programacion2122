import java.util.Scanner;

public class ejercicio16 {
static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sumaTotal());
	}
public static int leerInteger(String texto) {
	System.out.println("Introduce un numero");
	return Integer.parseInt(teclado.nextLine());
}
public static int sumaTotal() {
	final int NUMERODENUMEROS;
	int numero,resultado=0;
	NUMERODENUMEROS=15;
	for (int i=0;i<NUMERODENUMEROS;i++) {
		numero=leerInteger("Introduce un numero");
		resultado+=numero;
	}
	return resultado;
}
}
