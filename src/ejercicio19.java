import java.util.Scanner;

public class ejercicio19 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero = cuadradoNumero(leerEntero("Introduce un numero"));
		System.out.println(numero);

	}

	public static int leerEntero(String texto) {
		System.out.println("Introduce un numero");
		return Integer.parseInt(teclado.nextLine());
	}

	public static String cuadradoNumero(int numero) {
		int resultado = 0;
		String resultadoFinal = "";
		do {
			resultado = numero * numero;
			resultadoFinal += resultado + " ";
			numero = leerEntero("Introduce un numero");
		} while (numero > 0);
		return resultadoFinal;
	}

}
