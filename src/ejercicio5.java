import java.util.Scanner;

public class ejercicio5 {
	static Scanner teclado=new Scanner (System.in);
	public static void main(String[] args) {
		int hora;
		hora=leerNumero("Introduce una hora");
		System.out.println(saludo(hora));

	}
	public static int leerNumero(String texto) {
		System.out.println("Introduce una hora");
		return Integer.parseInt(teclado.nextLine());
	}
	public static String saludo (int hora) {
		String mensaje;
		if(hora>=6 && hora<=12) {
			mensaje = "Buenos días";
		}else if (hora<=13 && hora>=20) {
			mensaje="Buenas tardes";
		}else {
			mensaje="Buenas noches";
		}return mensaje;
	}
}
