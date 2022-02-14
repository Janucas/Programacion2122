import java.util.Scanner;

public class ejercicio {
static Scanner teclado= new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1,numero2;
		numero1=leerEntero("Introduce un numero");
		numero2=leerEntero("Introduce un numero");
		System.out.println(multiplo(numero1, numero2));
		
		

	}
public static boolean multiplo(int numero1,int numero2) {
	boolean bandera=false;
	if (numero1%numero2==0) {
		bandera=true;
	}else if (numero2%numero1==0) {
		bandera=true;
	}else {
		bandera=false;
	}
	return bandera;
}
public static int leerEntero(String texto) {
	System.out.println("Introduce un numero");
	return Integer.parseInt(teclado.nextLine());
}
}
