package entiedades;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		int eleccion = 0;
		
		do {
			System.out.println("Bienvenido al menu de empleados");
			System.out.println("1.Dar de alta");
			System.out.println("2.Mostrar empleados");
			System.out.println("3.Mostrar salario del empleado");
			System.out.println("4.Coste de la empresa(Salario de todos)");
			System.out.println("5.Salir del programa");
			eleccion = sc.nextInt();
			
			if (eleccion == 1) {
				System.out.println("¿Que tipo de empleado desea dar de alta?");
				System.out.println("1.Programador");
				System.out.println("2.Jefe de proyecto");
				System.out.println("3.Director");
				int tipoEleccion = sc.nextInt();
				switch (tipoEleccion) {
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
				
					break;
				default:
					System.out.println("Esta opcion no existe");
				}
			} else if (eleccion == 2) {
				
			} else if (eleccion == 3) {
				
			} else if (eleccion == 4) {
				mostrarCosteEmpresa(listaEmpleados);
			} else if (eleccion == 5) {
				System.out.println("Cerrando programa");
			} else {
				System.err.println("Opción no existente, elija otra");
			}
			
		} while (eleccion != 5);
		System.out.println("Programa cerrado");
	}
	
	/**
	 * El metodo darDeAltaProgramador(Scanner sc) con sus atributos rellenos.
	 * Los atributos serán pedidos por consola con la ayuda del objeto Scanner.
	 * 
	 * @param <b>sc</b> Objeto de la clase Scanner de la biblioteca
	 * java.util.Scanner, la construccion aplicada y recomendada es
	 * "Scanner sc = new Scanner(System.in);"
	 */
	public static Programador darDeAltaProgramador(Scanner sc) {
		Programador programador = new Programador();
		
		System.out.println("DNI:");
		programador.setDni(sc.nextLine());
		System.out.println("Nombre:");
		programador.setNombre(sc.nextLine());
		System.out.println("Sueldo Base:");
		programador.setSueldoBase(sc.nextDouble());
		
		return programador;
	}
	
	/**
	 * El metodo darDeAltaJefeProy(Scanner sc) con sus atributos rellenos.
	 * Los atributos serán pedidos por consola con la ayuda del objeto Scanner.
	 * 
	 * @param <b>sc</b> Objeto de la clase Scanner de la biblioteca
	 * java.util.Scanner, la construccion aplicada y recomendada es
	 * "Scanner sc = new Scanner(System.in);"
	 */
	public static JefeProyecto darDeAltaJefeProy(Scanner sc) {
		JefeProyecto jefeProy = new JefeProyecto();
		
		System.out.println("DNI:");
		jefeProy.setDni(sc.nextLine());
		System.out.println("Nombre:");
		jefeProy.setNombre(sc.nextLine());
		System.out.println("Sueldo Base:");
		jefeProy.setSueldoBase(sc.nextDouble());
		System.out.println("Incentivo:");
		
		return jefeProy;
	}
	
	/**
	 * El metodo darDeAltaDirector(Scanner sc) con sus atributos rellenos.
	 * Los atributos serán pedidos por consola con la ayuda del objeto Scanner.
	 * 
	 * @param <b>sc</b> Objeto de la clase Scanner de la biblioteca
	 * java.util.Scanner, la construccion aplicada y recomendada es
	 * "Scanner sc = new Scanner(System.in);"
	 * @return <b>objeto Director</b> con atributos rellenados
	 */
	public static Director darDeAltaDirector(Scanner sc) {
		Director director = new Director();
		
		System.out.println("DNI:");
		director.setDni(sc.nextLine());
		System.out.println("Nombre:");
		director.setNombre(sc.nextLine());
		System.out.println("Sueldo Base:");
		director.setSueldoBase(sc.nextDouble());
		
		return director;
	}
	
	/**
	 * El metodo mostrarEmpleados(ArrayList<Empleado/> listaEmpleados, Scanner sc)
	 * mostrara en orden y listado del 1 a n, todos los objetos empleado
	 * contenido en el ArrayList pasado por parametro. A continuacion, pedira
	 * por consola un numero del 1 a n, y a continución mostrara el salario del
	 * empleado cuya posicion en el array sea el numero pasado por parametro
	 * @param <b></b>
	 * @return
	 */

	/**
	 * El metodo mostrarCosteEmpresa(ArrayList<Empleado/> listaEmpleados) recorre
	 * todo los valores contenido en el array recogiendo un valor de tipo
	 * "double". Todos los valores seran sumados y al acabar, devolvera
	 * "El coste total de la empresa sera de (suma de todos los "double")".
	 * 
	 * Este metodo esta asociado al metodo devolverSalarioTot() de la clase
	 * empleado, por lo que si el array tiene algun valor distinto del objeto
	 * creado mediante la clase Empleado con su metodo devolverSalarioTot(),
	 * (metodo que devuelve un valor "double"), 
	 * 
	 * @param <b>listaEmpleados</b> es un objeto creado mediante la clase
	 * ArrayList.
	 * @return Todos los valores seran sumados y al acabar, devolvera
	 * <b>"El coste total de la empresa sera de (suma de todos los "double")"</b>
	 */
	public static void mostrarCosteEmpresa(ArrayList<Empleado> listaEmpleados) {
		double salTot = 0;
		for (Empleado e : listaEmpleados) {
			salTot += e.devolverSalarioTot();
		}
		System.out.println("El coste total de la empresa sera de " + salTot);
	}

}
