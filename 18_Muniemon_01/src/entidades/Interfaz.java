package entidades;

public class Interfaz {
	
	//Comienzo de una funcion
	public static void openingFuncion(String title) {
		int cantidadEspacios = 16 - (title.length() / 2);
		if (title.length() % 2 != 0) {
			cantidadEspacios--;
		}
		System.out.println("--------------------------------"); //16
		if (cantidadEspacios < 0) {
			for (int i = 0; i < cantidadEspacios; i++) {
				System.out.print(" ");
			}
		}
		System.out.print(title);
		System.out.println("--------------------------------");
		System.out.println();
	}
	
	//Finaliza una función
	public static void endingFuncion(String funcion) {
		System.out.println();
		System.out.println("Fin de" + funcion);
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
	}

}
