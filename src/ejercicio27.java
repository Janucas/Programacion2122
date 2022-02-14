import java.util.Scanner;

public class ejercicio27 {
static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		String tipoCadena,cadena;
		System.out.println("Introduce una cadena");
		cadena=teclado.nextLine();
		tipoCadena=cadenaFuerte(cadena);
		System.out.println(tipoCadena);

	}
public static String cadenaFuerte(String cadena) {
	String tipoCadena="";
	boolean banderaLongitud=false,banderaMayuscula=false,banderaMinuscula=false,banderaSignoPuntuacion=false,banderaDigito=false;
	for (int i=0;i<cadena.length();i++) {
		if (cadena.charAt(i)>=65 && cadena.charAt(i)<=90) {
			banderaMayuscula=true;
		}if (cadena.charAt(i)>=97 && cadena.charAt(i)<=122) {
			banderaMinuscula=true;
		}if (cadena.charAt(i)==44 ||cadena.charAt(i) ==46 ||cadena.charAt(i)==58 ||cadena.charAt(i)==59) {
			banderaSignoPuntuacion=true;
		}if (cadena.charAt(i)>=48 && cadena.charAt(i)<=57) {
			banderaDigito=true;
		}if (cadena.length()>7) {
			banderaLongitud=true;
		}
		
	}
	if (banderaDigito==true && banderaLongitud==true && banderaMayuscula==true && banderaMinuscula==true && banderaSignoPuntuacion==true) {
		tipoCadena="Fuerte";
	}else {
		tipoCadena="Debil";
	}
	return tipoCadena;
	
}
}
