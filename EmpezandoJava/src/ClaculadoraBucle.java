import java.util.Scanner;

public class ClaculadoraBucle {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int n1, n2, resultado = 0;
		boolean error = false;

		char opc, pregunta;

		System.out.println("¿Desea realizar alguna operacion (s/n)?");
		pregunta = teclado.nextLine().charAt(0);
		while (pregunta == 's') {
			System.out.println("Introduce la opcion (+,-,x,%)");
			opc = teclado.nextLine().charAt(0);

			System.out.println("Introduce el primer numero");
			n1 = Integer.parseInt(teclado.nextLine());

			System.out.println("Introduce el segundo numero");
			n2 = Integer.parseInt(teclado.nextLine());

			switch (opc) {
				case '+': 
					resultado = n1 + n2;
					break;
				
				case '-': 
					resultado = n1 - n2;
					break;
				
				case 'x': 
					resultado = n1 * n2;
					break;
				
				case '%': 
					resultado = n1 / n2;
					break;
				default:
					error=true;
					
				
			}
			if (error==true) {
				System.out.println("Operacion erronea");
			}else {
				System.out.println(resultado);
				
				System.out.println("¿Desea realizar alguna operacion (s/n)?");
				pregunta = teclado.nextLine().charAt(0);
			}
			}

		}
	}


