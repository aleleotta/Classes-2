package exercise1;
import java.util.*;

public class Hour {
	private long hour = 0;
	private long minute = 0;
	private long second = 0;
	
	public Hour() {}
	
	public Hour(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public boolean secondsIncrement(long second) {
		boolean confirm = true;
		if(second > 0) {
			this.second = this.second + second;
			while(this.second >= 60) {
				this.minute++;
				this.second = this.second - 60;
			}
			while(this.minute >= 60) {
				this.hour++;
				this.minute = this.minute - 60;
			}
		} else {
			confirm = false;
		}
		return confirm;
	}
	
	public void printTime() {
		System.out.println("\t" + getHour() + ":" + getMinute() + ":" + getSecond() + "\n");
	}
	
	public long getHour() {
		return hour;
	}

	public void setHour(long hour) {
		this.hour = hour;
	}

	public long getMinute() {
		return minute;
	}

	public void setMinute(long minute) {
		this.minute = minute;
	}

	public long getSecond() {
		return second;
	}

	public void setSecond(long second) {
		this.second = second;
	}
	
}

/*Diseñar la clase Hora, que dispone de los atributos hora, minuto y segundo. Además
Añade los siguientes constructores:
● Constructor sin parámetros.
● Constructor con todos los parámetros.
Se accederán a ellos a través de métodos get/set.
Añade también el método incrementaSegundo que incrementa un segundo a la hora
actual.
Prueba esta clase de forma que en el main se pida la cantidad de segundos a
incrementar y muestre por pantalla el resultado de incrementar esos segundos.  
*/