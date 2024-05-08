package game;

public class Guerrero extends Personaje {

	private int fuerza;

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	@Override
	public String toString() {
		return "Guerrero [fuerza=" + fuerza + "]";
	}

	@Override
	public void Ataca(Personaje p1) {
		if (this.getArma() instanceof Espada || this.getArma() instanceof
				Arco) {
			p1.setVida(p1.getVida() - this.getArma().getAtaque() - this.fuerza);
		} else {
			p1.setVida(p1.getVida() - this.getArma().getAtaque());
		}
	}
	
	
	
}
