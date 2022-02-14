package ejerciciosBoletin;

public class Ej14Multiplo5WHILE {

	public static void main(String[] args) {
		System.out.println(multiploCinco());
	}
	
	public static int multiploCinco() {
		int i=0;
		while (i<100) {
			System.out.println(i);
			i+=5;
		}
		
		return i;
	}

}
