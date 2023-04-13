package exercise4;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Disc list[] = new Disc[10];
		Scanner sc = new Scanner(System.in);
		Disc discs;
		for(int i = 0; i < list.length; i++) {
			discs = new Disc();
			list[i] = discs;
		}
		int option = 0;
		while(option != 5) {
			System.out.print("\nDISC COLLECTION\n"
					+ "===============================\n"
					+ "1) List\n"
					+ "2) New disc\n"
					+ "3) Modify\n"
					+ "4) Delete\n"
					+ "5) Exit\n\n"
					+ "Option: ");
			option = sc.nextInt();
			switch(option) {
			case 1: //READ
				int i = 0;
				System.out.println("List\n===============================\n");
				for(Disc read: list) {
					i++;
					System.out.println(i + ")\n" + "Code: " + read.getCode()
					+ "\nAuthor: " + read.getAuthor()
					+ "\nTitle: " + read.getTitle()
					+ "\nGenre: " + read.getGenre()
					+ "\nDuration: " + read.getDuration() + " s\n");
				}
				break;
			case 2: //CREATE
				break;
			case 3: //UPDATE
				break;
			case 4: //DELETE
				break;
			case 5: //EXIT
				System.out.println("\n\nExiting CRUD...\n\n\nCRUD terminated.");
				break;
			default: //ERROR
				System.out.println("\nERROR!");
				break;
			}
		}
		sc.close();
	}
}

/*Crea la clase Disco con los siguientes atributos: codigo, autor, titulo, genero de tipo
String y duracion de tipo int. Por defecto el código tendrá el valor “LIBRE”.
Crea los siguientes métodos:
	● Contructores vacío, con parámetros y copia.
	● Gettes y setters.
	● toString.
En el programa principal crea un CRUD para gestionar los discos de una colección:
	1. Crea un array de discos de 10 elementos.
	2. Para gestionar dicha colección debes crear el siguiente menú de opciones:

		COLECCIÓN DE DISCOS
		===================
		1. Listado.
		2. Nuevo Disco.
		3. Modificar.
		4. Borrar.
		5. Salir.

	3. Para listar los discos se recorre el array y muestran todos los discos que hay
	guardados en el array. Para ello comprobamos que en su código no tenga la
	palabra “LIBRE”.
	4. Para añadir nuevo disco se piden los datos por teclado y se añade a la primera
	posición del array donde esté libre. Para ello se debe crear un contador en el
	programa principal. Este contador debe aumentar cuando insertamos un
	disco nuevo y disminuir cuando borramos un disco y es el código con el que
	se guarda el disco.
	5. Para modificar un disco debemos buscarlo por su código y pedir al usuario
	por teclado los nuevos datos del disco.
	6. Para borrarlo debemos pedir al usuario el código del disco a borrar y poner en
	su código la palabra “LIBRE”, así estará disponible para insertar nuevos discos.
	7. Comprueba que funciona correctamente introduciendo valores a los discos y
	probando las opciones del CRUD.
*/