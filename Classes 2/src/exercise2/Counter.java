package exercise2;

public class Counter {
	private int counter = 0;
	
	public Counter() {} //Default
	
	public Counter(int counter) { //With parameter
		if(counter > 0) {
			this.counter = counter;
		} else {
			this.counter = 0;
		}
	}
	
	public Counter(Counter object) { //Copy
		this.counter = object.counter;
	}
	
	public void increase(int num) {
		this.counter = this.counter + num;
	}
	
	public boolean decrease(int num) {
		boolean positive = true;
		if(num >= 0) {
			this.counter = this.counter - num;
		} else {
			positive = false;
		}
		return positive;
	}
	
	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
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