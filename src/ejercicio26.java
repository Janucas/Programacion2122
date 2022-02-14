import java.util.Scanner;

public class ejercicio26 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String numero = "";
		String cadenaFinal="";
		System.out.println("Introduce un numero");
		numero=teclado.nextLine();
		for (int i=numero.length()-1;i>=0;i--) {
			cadenaFinal+=numero.charAt(i);
		}
		System.out.println(cadenaFinal);

	}

}
