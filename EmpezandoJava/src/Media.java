import java.util.Scanner;

public class Media {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		double num, cantidad, acum=0, media;
		
		for (cantidad=1; cantidad<=10;cantidad++) {
			System.out.println("Introduzca un numero");
			num = Integer.parseInt(teclado.nextLine());
			acum+=num;
		}
		media=acum/(cantidad-1);
		System.out.println("Su media es: " + media);
	}

}
