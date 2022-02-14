import java.util.Scanner;

public class JuegoAdivinarNumero {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int n, adivina, cont = 0;

		n = (int) (Math.random() * 1000);
		System.out.println("Intenta adivinar el numero en el que pienso");
		adivina = Integer.parseInt(teclado.nextLine());

		while (adivina != n) {
			if (n < adivina) {
				System.out.println("El numero en el que pienso es menor");
			} else if (n > adivina) {
				System.out.println("El numero en el que pienso es mayor");
			} else {

			}
			cont += 1;
			System.out.println("Introduzca otro numero");
			adivina = Integer.parseInt(teclado.nextLine());
		}
		System.out.println("ENHORABUENA, ME HAS LEIDO LA MENTE!!");
		System.out.println("El numero en el que pensaba era el " + n);
		System.out.println("Lo has adivinado en " + cont + " intentos");
	}

}
