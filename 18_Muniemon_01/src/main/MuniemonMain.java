package main;

import java.util.Scanner;

public class MuniemonMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------------------");
		System.out.println("-----------Bienvenido-----------");
		System.out.println("--------------------------------");
		
		int seleccion = 0;
		do {
			System.out.println("--------------------------------");
			System.out.println("Seleccione lo que desea hacer");
			System.out.println("1.Dar de alta Muniemon");
			System.out.println("2.Mostrar Muniemon");
			System.out.println("3.Salir del programa");
			seleccion = sc.nextInt();
			if (seleccion == 1) {
				
			} else if (seleccion == 2) {
				
			} else if (seleccion != 3) {
				System.err.println("No existe esta opción, por favor seleccione"
						+ " 1, 2 o 3");
			}
		} while (seleccion != 3);
		
	}
	
}
