import java.util.Objects;

public class Cuenta {
	private double saldo;
	private double nIngreso;
	private double nReintegros;
	private int ncc;
	public Cuenta(double saldo, int ncc) {
		super();
		this.saldo = saldo;
		this.ncc = ncc;
	}
	public double getSaldo() {
		return saldo;
	}
	public double getnIngreso() {
		return nIngreso;
	}
	public double getnReintegros() {
		return nReintegros;
	}
	
	public  boolean ingresar(float cantidad) {
		boolean permitido=false;
		if (cantidad<=0) {
			permitido=true;
			saldo+=cantidad;
		}
		return permitido;
	}
	
	public  boolean reintegro(float cantidad) {
		boolean permitido=true;
		if (cantidad>saldo) {
			permitido=false;
			saldo-=cantidad;
		}
		return permitido;
		
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(ncc);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		return ncc == other.ncc;
	}
	
	
	

}
