package ejerciciosBoletin;

public class Ej8UnoAlCienWHILE {

	public static void main(String[] args) {
		System.out.println(unoAlCien());
	}
	
	public static int unoAlCien() {
		int i=0;
		while (i<100) {
			System.out.println(i);
			i++;
		}
		return i;
	}
}
