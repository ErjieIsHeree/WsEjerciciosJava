package entiedades;

import java.util.ArrayList;
import java.util.Scanner;

public class mainEmpleados {
	
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
					listaEmpleados.add(darDeAltaProgramador(sc));
					break;
				case 2:
					listaEmpleados.add(darDeAltaJefeProy(sc));
					break;
				case 3:
					listaEmpleados.add(darDeAltaDirector(sc));
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
		jefeProy.setIncentivo(sc.nextDouble());
		
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
	 * muestra todos los empleados con sus atributos contenidos en el Array
	 * creado mediante la clase ArrayList contenido por objetos creados mediante
	 * la clase Empleado y sus herederos.
	 */
	
	/**
	 * El metodo mostrarSalario(ArrayList<Empleado/> listaEmpleados, int empl)
	 * muestra el salario del empleado cuya posicion en el array list pasado por
	 * parametro sea la misma que el valor del valor entero pasado por parametro
	 * @param <b>listaEmpleados</b> un objeto creado mediante la clase ArrayList
	 * de la biblioteca de java (java.util.ArrayList) que contiene objetos
	 * creados mediante la clase Empleado y sus herederos. <b>empl</b> valor
	 * entero que determinara la posicion de array list del que se 
	 * (java.util.Scanner).
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
	 * creado mediante la clase Empleado o sus herederos, con su metodo 
	 * devolverSalarioTot(), (metodo que devuelve un valor "double"), podria
	 * no funcionar correctamente.
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
