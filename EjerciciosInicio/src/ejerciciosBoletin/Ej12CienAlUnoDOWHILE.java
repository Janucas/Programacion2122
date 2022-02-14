package ejerciciosBoletin;

public class Ej12CienAlUnoDOWHILE {

	public static void main(String[] args) {
		System.out.println(CienAlUno());
	}
	
	public static int CienAlUno() {
		int i=100;
		do {
			System.out.println(i);
			i--;
		}while(i>=1);
		return i;
	}

}
