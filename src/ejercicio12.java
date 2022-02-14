
public class ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiplo5();
	}

	public static void multiplo5() {
		int cont = 0;
		do {
			if (cont % 5 == 0) {
				System.out.println(cont);
				
			}cont++;
		} while (cont <= 100);
	}
}
