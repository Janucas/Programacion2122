package ejerciciosBoletin;

public class Ej17320Al160WHILE {

	public static void main(String[] args) {
		System.out.println(treVeinteAlCientosesenta());
	}
	
	public static int treVeinteAlCientosesenta() {
		int i=320;
		while (i>160) {
			System.out.println(i);
			i-=20;
		}
		
		return i;
	}

}
