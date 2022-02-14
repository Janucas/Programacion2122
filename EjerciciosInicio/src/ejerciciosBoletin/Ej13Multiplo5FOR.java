package ejerciciosBoletin;

public class Ej13Multiplo5FOR {

	public static void main(String[] args) {
		System.out.println(multiploCinco());
	}
	
	public static int multiploCinco() {
		int i;
		for (i=0;i<100;i+=5) {
			System.out.println(i);
		}
		
		return i;
	}

}
