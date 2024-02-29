package main;

import java.util.Scanner;

import entidades.Interfaz;
import entidades.Muniemon;

public class MuniemonMain {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		
	}
	
	//Muestra el menú de acciones que realizar con el muniemon
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
			
			Interfaz.openingFuncion("Creación de muniemon");
			
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
			Muniemon muniemon = new Muniemon();
			muniemon.asignacionNombreMuniemon();
			muniemon.asignacionStatsMuniemon();
			muniemon.asignacionElementosMuniemon();
			
			Interfaz.endingFuncion(" la creación de tu muniemon");
			
			return muniemon;
			
		}
	
}
