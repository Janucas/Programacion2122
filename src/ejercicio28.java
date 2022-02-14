import java.util.Scanner;

public class ejercicio28 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce una cadena");
		String cadena = teclado.nextLine();
		String cadenaFinal = cambiaCadena(cadena);
		System.out.println(cadenaFinal);
	}

	public static String cambiaCadena(String cadena) {
		String cadenaFinal = "";
		for (int i = 1; i < cadena.length(); i += 2) {
			cadenaFinal = cadenaFinal + cadena.charAt(i) + cadena.charAt(i-1);
		}
		if (cadena.length() % 2 == 1) {
			cadenaFinal = cadenaFinal + cadena.charAt(cadena.length() - 1);
		}
		return cadenaFinal;
	}
}
