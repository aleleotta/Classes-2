package exercise2;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int counter = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		String set = "";
		Counter counterObj = new Counter();
		while(!set.equalsIgnoreCase("yes") && !set.equalsIgnoreCase("no")) {
			System.out.println("Do you want to set the counter to a specific number?");
			set = sc.next();
			if(set.equalsIgnoreCase("yes")) {
				System.out.print("Introduce a number: ");
				counter = sc.nextInt();
				counterObj = new Counter(counter);
			} else {
				counterObj = new Counter();
			}
		}
		int option = 0;
		while(option != 3) {
			System.out.println("\nCounter: " + counterObj.getCounter());
			System.out.print("\nMenu:\n\n1) Increase counter\n2) Decrease counter\n3) Exit program\n\nOption: ");
			option = sc.nextInt();
			switch(option){
			case 1: //Increase counter
				System.out.print("\nIntroduce the number to sum within the counter: ");
				num = sc.nextInt();
				counterObj.increase(num);
				break;
			case 2: //Decrease counter
				System.out.print("\nIntroduce the number to subtract within the counter: ");
				num = sc.nextInt();
				counterObj.decrease(num);
				break;
			case 3: //Exit
				System.out.println("\n\nExiting program...\n\n\nProgram terminated.");
				break;
			default: //Error message
				System.out.println("Please introduce a valid option!");
				break;
			}
		}
		sc.close();
	}
}

/*Crea una clase llamada Contador que contenga un único atributo entero llamado cont.
La clase tendrá los siguientes constructores:
	● Constructor por defecto
	● Constructor con parámetros para inicializar el contador con un valor no
negativo. Si el valor inicial que se recibe es negativo el contador tomará el
valor cero como valor inicial.
	● Constructor copia.
Además de los métodos getter y setter, la clase contendrá los métodos:
	● incrementar: incrementa el contador en una unidad.
	● decrementar: decrementa el contador en una unidad. El contador nunca
podrá tener un valor negativo. Si al decrementar se alcanza un valor negativo
el contador toma el valor cero.
*/