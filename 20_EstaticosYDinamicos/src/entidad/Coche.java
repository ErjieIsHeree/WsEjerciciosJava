package entidad;

public class Coche {
	
	private int id;
	private String matricula;
	private String marca;
	private static int contadorID = 0;
	private static final String toy = "TOYOTA";
	private static final String ren = "RENAULT";
	
	public Coche() {
		super();
		this.id = contadorID;
		contadorID++;
	}
	
	@Override
	public String toString() {
		return "Coche [id=" + id + ", matricula=" + matricula + ", marca=" + marca + "]";
	}

	public void mostrarContador() {
		System.out.println(contadorID);
	}
	
	public void resetContadorID() {
		contadorID = 0;
	}
	
}
