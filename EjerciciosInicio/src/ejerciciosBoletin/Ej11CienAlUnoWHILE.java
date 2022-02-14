package ejerciciosBoletin;

public class Ej11CienAlUnoWHILE {

	public static void main(String[] args) {
		System.out.println(CienAlUno());
	}
	
	public static int CienAlUno() {
		int i=100;
		while (i>0) {
			System.out.println(i);
			i--;
		}
		return i;
	}

}
