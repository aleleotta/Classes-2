package exercise4;
import java.util.*;

public class Disc {
	private String codigo = "FREE";
	private String author = "";
	private String title = "";
	private String genre = "";
	private int duration = 0;
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