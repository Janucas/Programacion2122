package ejerciciosBoletin;

public class Ej15Multiplo5DOWHILE {

	public static void main(String[] args) {
		System.out.println(CienAlUno());
	}
	
	public static int CienAlUno() {
		int i=100;
		do {
			System.out.println(i);
			i-=5;
		}while(i>=1);
		return i;
	}

}
