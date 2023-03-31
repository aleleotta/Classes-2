package exercise3;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
	}
}

/*Crear una clase Fecha en Java. La clase tendrá tres atributos privados: día, mes y año
de tipo int. La clase contendrá los siguientes métodos:
	● Constructor sin parámetros.
	● Constructor con tres parámetros para crear objetos con valores iniciales.
	● Métodos set y get para asignar y obtener los valores de los atributos de la
	clase. Deben controlar que los valores a asignar son correctos.
	● Método esBisiesto() que calcula si el año es o no bisiesto. El método
	esBisiesto devuelve true si el año es bisiesto y false si no lo es. Este método
	debe declararse como privado.
	● Método fechaCorrecta() que comprueba si la fecha es correcta. Devuelve un
	valor de tipo boolean indicando si la fecha es correcta o no. Este método a su
	vez utilizará el método esBisiesto.
	● Método diaSiguiente() que cambia la fecha actual por la del día siguiente. El
	objeto de la clase Fecha al que se le aplique este método deberá quedar
	siempre en un estado consistente, es decir, la nueva fecha deberá ser
	correcta.
	● Modificar el método toString() heredado de Object para mostrar las fechas de
	la forma dd-mm-aaaa. El día y el mes se deben mostrar con dos cifras. Si el
	dia o el mes tienen solo una cifra se escribirá un cero delante. Por ejemplo si
	la fecha es dia=1, mes=6, año= 2015 la fecha que se mostrará será:
	01-06-2015.
*/