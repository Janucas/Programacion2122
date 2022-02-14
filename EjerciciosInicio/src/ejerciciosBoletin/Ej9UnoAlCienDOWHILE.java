package ejerciciosBoletin;

public class Ej9UnoAlCienDOWHILE {

	public static void main(String[] args) {
		System.out.println(unoAlCien());
	}
	
	public static int unoAlCien() {
		int i=0;
		do {
			System.out.println(i);
			i++;
		}while(i<100);
		
		return i;
	}
}
