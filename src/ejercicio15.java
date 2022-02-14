
public class ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(contarNumeros());
	}

	public static String contarNumeros() {
		int cont = 320;
		String cadenaFinal = "";
		do {
			cadenaFinal += cont + " ";
			cont -= 20;
		} while (cont >= 160);
		return cadenaFinal;
	}

}
