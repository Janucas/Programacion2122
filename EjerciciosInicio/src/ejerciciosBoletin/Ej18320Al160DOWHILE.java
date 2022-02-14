package ejerciciosBoletin;

public class Ej18320Al160DOWHILE {

	public static void main(String[] args) {
		System.out.println(treVeinteAlCientosesenta());
	}
	
	public static int treVeinteAlCientosesenta() {
		int i=320;
		do {
			System.out.println(i);
			i-=20;
		}while(i>=160);
		return i;
	}

}
