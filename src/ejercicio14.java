
public class ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(contarAtras());

	}
public static String contarAtras() {
	int cont=320;
	String cadenaFinal="";
	while (cont>=160) {
		cadenaFinal+=cont + " ";
		cont-=20;
	}
	return cadenaFinal;
}
}
