import java.util.Scanner;

public class ejercicio25 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce un numero");
		int numero = Integer.parseInt(teclado.nextLine());
		System.out.println(fibonacci(numero));
	}

	public static int fibonacci(int numero) {
		int fiboAnterior, fiboAnteriorAnterior, fibo = 0;
		fiboAnterior = 1;
		fiboAnteriorAnterior = 0;
		for (int i = 2; i <=numero; i++) {
			fibo = fiboAnterior + fiboAnteriorAnterior;
			fiboAnteriorAnterior = fiboAnterior;
			fiboAnterior = fibo;
		}
		return fibo;

	}
}
