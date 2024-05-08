package game;

public class Mago extends Personaje {
	
	private int inteligencia;

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	@Override
	public String toString() {
		return "Mago [inteligencia=" + inteligencia + "]";
	}

	@Override
	public void Ataca(Personaje p1) {
		if (this.getArma() instanceof Hechizo) {
			p1.setVida(p1.getVida() - this.getArma().getAtaque() -
					this.inteligencia);
		} else {
			p1.setVida(p1.getVida() - this.getArma().getAtaque());
		}
	}

}
