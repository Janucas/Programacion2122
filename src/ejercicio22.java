import java.util.Scanner;

public class ejercicio22 {
static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		int numero,mayorPares=0,resultadoImpares=0,contadorImpares=0,numeroPar=0,cont=0;
		numero=leerEntero("Introduce un numero");
		while (numero>0) {
			if (numero%2==0) {
				numeroPar=numero;
				if (numeroPar>mayorPares) {
					mayorPares=numeroPar;
				}else {
					contadorImpares+=1;
					resultadoImpares+=numero;
				}
			}
			cont+=1;
			numero=leerEntero("Introduce un numero");
			
		}
		System.out.println("El mayor es "+mayorPares);
		System.out.println(cont);
		System.out.println(resultadoImpares/(double)contadorImpares);

	}
public static int leerEntero(String texto) {
	System.out.println("Introduce un numero");
	return Integer.parseInt(teclado.nextLine());
}
}
