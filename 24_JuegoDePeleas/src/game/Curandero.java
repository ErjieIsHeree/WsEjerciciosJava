package game;

public class Curandero extends Personaje {
	
	private int sabiduria;

	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}

	@Override
	public String toString() {
		return "Curandero [sabiduria=" + sabiduria + "]";
	}

	@Override
	public void Ataca(Personaje p1) {
		if (this.getArma() instanceof Rezo) {
			p1.setVida(p1.getVida() - this.getArma().getAtaque() -
					this.sabiduria);
		} else {
			p1.setVida(p1.getVida() - this.getArma().getAtaque());
		}
	}
	

}
