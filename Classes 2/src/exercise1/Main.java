package exercise1;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		long hour = -1;
		long minute = -1;
		long second = -1;
		Scanner sc = new Scanner(System.in);
		while(hour < 0 || minute < 0 || second < 0) {
			System.out.println("Introduce the following parameters.");
			System.out.print("Hours: ");
			hour = sc.nextLong();
			System.out.print("Minutes: ");
			minute = sc.nextLong();
			System.out.print("Seconds: ");
			second = sc.nextLong();
			if(hour < 0 || minute < 0 || second < 0) {
				System.out.println("\nMake sure all parameters are not negative!\n");
			}
		}
		Hour time = new Hour(hour, minute, second);
		int option = 0;
		while(option != 3) {
			System.out.print("\nOptions\n1) Print time\n2) Add seconds to time\n3) Exit program\n\nIntroduce an option: ");
			option = sc.nextInt();
			switch(option) {
			case 1: //Print
				time.printTime();
				break;
			case 2: //Add seconds
				long addedSeconds = 0;
				System.out.print("\nIntroduce the seconds you want to add to the time: ");
				addedSeconds = sc.nextLong();
				if(time.secondsIncrement(addedSeconds) == false) {
					System.out.println("Make sure the seconds are positive and above 0 otherwise no seconds will be added.");
				}
				time.printTime();
				break;
			case 3:
				break;
			default: //Error
				System.out.println("Introduce a valid option!");
				break;
			}
		}
		System.out.println("\nExiting program...\n\nProgram terminated.");
		sc.close();
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