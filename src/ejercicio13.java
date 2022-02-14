
public class ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(contar20());
	}
public static String contar20() {
	String cadenaFinal= " ";
	for (int i=320;i>=160;i-=20) {
		cadenaFinal+=i+" ";
	}
	return cadenaFinal;
}
}
