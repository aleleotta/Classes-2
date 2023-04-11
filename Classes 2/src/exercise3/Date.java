package exercise3;
import java.util.*;

public class Date {
	
	private int day = 0;
	private int month = 0;
	private int year = 0;
	
	public Date() {}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	private boolean leapYear() {
		boolean leap = false;
		if(this.year % 4 == 0) {
			leap = true;
			if(this.year % 100 == 0) {
				leap = false;
			}
		}
		return leap;
	}
	
	public boolean correctDate() {
		boolean correct = false;
		if(leapYear() == true) {
			correct = true; 
		}
		return correct;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(day >= 0) {
			this.day = day;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month >= 0) {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year >= 0) {
			this.year = year;
		}
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