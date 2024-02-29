package entidades;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Interfaz;

import enumeradores.TipoElemento;

public class Muniemon {
	
	Scanner sc = new Scanner(System.in);
	
	private String nombre;
	private int vida;
	private int ataque;
	private int defensa;
	private ArrayList<TipoElemento> tipo;
	
	public Muniemon() {
		super();
	}
	
	public Muniemon(String nombre, int vida, int ataque, int defensa, ArrayList<TipoElemento> tipo) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Muniemon [nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa
				+ ", tipo=" + tipo + "]";
	}

	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna un nombre al Muniemon, si el muniemon
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public double getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public ArrayList<TipoElemento> getTipo() {
		return tipo;
	}

	public void setTipo(ArrayList<TipoElemento> tipo) {
		this.tipo = tipo;
	}
	
	
	//Menú muniemon
	public void menuMuniemon() {
		
		Interfaz.openingFuncion("Bienvenido al menu");
		
		int seleccion = 0;
		do {
			System.out.println("Seleccione lo que desea hacer");
			System.out.println("1.Dar de alta Muniemon");
			System.out.println("2.Mostrar Muniemon");
			System.out.println("3.Salir del programa");
			seleccion = sc.nextInt();
			if (seleccion == 1) {
				creacionMuniemon();
			} else if (seleccion == 2) {
				mostrarMuniemon();
			} else if (seleccion != 3) {
				System.err.println("No existe esta opción, por favor seleccione"
						+ " 1, 2 o 3");
			}
		} while (seleccion != 3);

		Interfaz.endingFuncion("l programa");
		
	}
	
	//Crea un muniemon (para usuario)
	public Muniemon creacionMuniemon() {
		
		Muniemon muniemon = 
		
		Interfaz.openingFuncion("Crea tu muniemon");
		
		System.out.println("Reglas para la creación:");
		System.out.println();
		System.out.println("1.El nombre no podrá contener carácteres raros");
		System.out.println();
		System.out.println("2.Tendrás un total de 99 puntos para añadir"
				+ "en cualquiera de las estadísticas que deseas, por lo que"
				+ "calcula bien donde quieres aplicarlos");
		System.out.println();
		System.out.println("3.Los muniemons pueden tener hasta 2 elementos como"
				+ "máximo");
		System.out.println();
		System.out.println("4.DIVIÉRTETE");
		System.out.println();
		System.out.println("Presiona enter para continuar");
		sc.nextLine();
		asignacionNombreMuniemon();
		asignacionStatsMuniemon();
		asignacionElementosMuniemon();
		
		Interfaz.endingFuncion(" la creación de tu muniemon");
		
	}
	
	//Asigna nombre al muniemon
	public void asignacionNombreMuniemon() {
		
		Interfaz.openingFuncion("Nombre");
		
		System.out.println("¿Qué nombre deseas darle a tu muniemon?");
		System.out.println();
		this.nombre = sc.nextLine();
		
		Interfaz.endingFuncion(" la asignación de nombre");
		
	}
	
	//Asigna estadísticas al muniemon
	public void asignacionStatsMuniemon() {
		
		Interfaz.openingFuncion("Asigna Stats");
		
		int statsRestantes = 99;
		int apliStats = 0;
		boolean aplicadoCorrectamente = false;
		
		//Asignación de vida
		do {
			System.out.println("¿Cuántos puntos deseas aplicar en vida?");
			System.out.println();
			apliStats = sc.nextInt();
			System.out.println();
			if (apliStats >= 0 && apliStats <= statsRestantes) {
				this.vida = 1 + apliStats;
				statsRestantes -= apliStats;
				aplicadoCorrectamente = true;
			} else {
				System.out.println("Error, no se puede introducir esta cantidad"
						+ "de puntos");
				mostrarStats();
			}
		} while (!aplicadoCorrectamente);
		
		//Asignación de ataque
		do {
			System.out.println("¿Cuántos puntos deseas aplicar en ataque?");
			System.out.println();
			apliStats = sc.nextInt();
			System.out.println();
			if (apliStats >= 0 && apliStats <= statsRestantes) {
				this.ataque = 1 + apliStats;
				statsRestantes -= apliStats;
				aplicadoCorrectamente = true;
			} else {
				System.out.println("Error, no se puede introducir esta cantidad"
						+ "de puntos");
				mostrarStats();
			}
		} while (!aplicadoCorrectamente);
		
		//Asignación de defensa
		do {
			System.out.println("¿Cuántos puntos deseas aplicar en defensa?");
			System.out.println();
			apliStats = sc.nextInt();
			System.out.println();
			if (apliStats >= 0 && apliStats <= statsRestantes) {
				this.defensa = 1 + apliStats;
				statsRestantes -= apliStats;
				aplicadoCorrectamente = true;
			} else {
				System.out.println("Error, no se puede introducir esta cantidad"
						+ "de puntos");
				mostrarStats();
			}
		} while (!aplicadoCorrectamente);
		
		Interfaz.endingFuncion(" la asignación de estadísticas");
		
	}
	
	//Muestra solo las estadísticas de muniemon
	public void mostrarStats() {
		
		Interfaz.openingFuncion("Estadísticas");
		
		System.out.println();
		System.out.println("Vida: 		" + this.vida);
		System.out.println();
		System.out.println("Ataque: 	" + this.ataque);
		System.out.println();
		System.out.println("Defensa:	" + this.defensa);
		System.out.println();
		int statsRestantes = 99;
		statsRestantes -= (this.vida - 1);
		statsRestantes -= (this.ataque - 1);
		statsRestantes -= (this.defensa - 1);
		System.out.println("Stats restantes: " + statsRestantes);
		
		Interfaz.endingFuncion(" los stats");
		
	}
	
	//Asigna elementos al muniemon
	public void asignacionElementosMuniemon() {
		//Asignación de elementos
		System.out.println("¿Cuántos elementos controla tu muniemon?");
		
		//Control cantidad de elementos
		int cantidadElementos = 0;
		do {
			cantidadElementos = sc.nextInt();
			if (cantidadElementos < 0 || cantidadElementos > 3) {
				System.err.println("El muniemon debe tener 1 o 2 elementos");
				System.out.println("Introduce cuántos elementos debe tener");
			}
		} while (cantidadElementos < 0 || cantidadElementos > 3);
		
		//Un solo elemento
		if (cantidadElementos == 1) {
			System.out.println("Introduce el número del elemento que controla");
			for (int i = 0; i < TipoElemento.values().length; i++) {
				System.out.println(i + "-" + TipoElemento.values()[i]);
			}
			int seleElem = sc.nextInt();
			this.tipo.add(TipoElemento.values()[seleElem - 1]);
		} else {
			System.out.println("Introduce el número del primer elemento que"
					+ "controla");
			for (int i = 0; i < TipoElemento.values().length; i++) {
					System.out.println(i + "-" + TipoElemento.values()[i]);
			}
			int seleElem = sc.nextInt();
			this.tipo.add(TipoElemento.values()[seleElem - 1]);
			int seleElem2 = 0;
			do {
				System.out.println("Introduce el número del segundo elemento"
					+ "que controla");
			for (int i = 0; i < TipoElemento.values().length; i++) {
				System.out.println(i + "-" + TipoElemento.values()[i]);
			}
			seleElem2 = sc.nextInt();
			this.tipo.add(1, TipoElemento.values()[seleElem - 1]);
			if (seleElem == seleElem2) {
				System.out.println("Los elementos no pueden ser iguales, "
					+ "por favor selecciona otro");
			}
			} while (seleElem == seleElem2);
		}
	}
	
	
	
	// Funciones para interfaz de las funciones previas
	
	
}
