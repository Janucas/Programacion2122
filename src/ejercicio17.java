import java.util.Scanner;

public class ejercicio17 {
	static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(multiplo3());
	}
public static int multiplo3() {
	int numero,contadorNumero=0,contador=0;
	do {
		numero=leerEntero("Introduce un numero");
		if (numero%3==0) {
			contadorNumero+=1;
		}contador+=1;
		
	}while (contador<5);
	return contadorNumero;
	
	
	
}
public static int leerEntero(String texto) {
	System.out.println("Introduce un numero");
	return Integer.parseInt(teclado.nextLine());
}
}
