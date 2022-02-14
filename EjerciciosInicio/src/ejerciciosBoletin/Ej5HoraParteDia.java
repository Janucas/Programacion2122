package ejerciciosBoletin;

import java.util.Scanner;

public class Ej5HoraParteDia {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Indique la hora");
		int horaUsuario = Integer.parseInt(teclado.nextLine());
		System.out.println(horaActual(horaUsuario));

	}

	public static String horaActual(int hora) {
		String resultado;
		if (hora >= 6 && hora <= 12) {
			resultado = "Buenos dias dormilon";
		} else if (hora >= 13 && hora <= 20) {
			resultado = "Buenas tardes";
		} else {
			resultado = "Buenas noches";
		}
		return resultado;
	}

}

//Comprobar que las horas estan comprendidas dentro de las 24 h del dia
// OPCIONES-->While que compruebe que el numero es correcto
// O hacer que el propio metodo lo revise
