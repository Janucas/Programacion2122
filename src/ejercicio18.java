import java.util.Scanner;

public class ejercicio18 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=leerEntero("Introduce un numero");
System.out.println(sumar100(numero));
	}

	public static int leerEntero(String texto) {
		System.out.println("Introduce un numero");
		return Integer.parseInt(teclado.nextLine());
	}

	public static int sumar100(int numero) {
		int resultado = 0;
		while (numero < 0) {
			System.out.println("Error");
			numero = leerEntero("Introduce un numero");
		

		}
		for (int i = 0; i <= 100; i++) {
			resultado += numero + 1;
			}
		return resultado;
	}

}
