import java.util.Scanner;

public class ejercicio24 {
static Scanner teclado= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sueldo=0,resultado=0;
		int contMayor1000=0;
		for (int i=0;i<10;i++) {
			sueldo=leerEntero("Introduce un sueldo");
			while (sueldo<0) {
				System.out.println("Error");
				sueldo=leerEntero("Introduce un sueldo");

			}
			if (sueldo>1000) {
				contMayor1000+=1;
			}
			resultado+=sumar10sueldos(sueldo);
		}
		System.out.println("La suma de los sueldos es "+resultado);
		System.out.println("Hay "+contMayor1000+" mayores de 1000 euros");
		
	}
public static double sumar10sueldos(double numero) {
	double resultado=0;
	resultado+=numero;
	return resultado;
	
	
}
public static int leerEntero(String texto) {
	System.out.println(texto);
	return Integer.parseInt(teclado.nextLine());
}
}
