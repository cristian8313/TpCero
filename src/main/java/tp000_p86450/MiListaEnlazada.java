package tp000_p86450;

public class MiListaEnlazada {
	private Nodo primero = null;
	private int size;
		
	public MiListaEnlazada() {
		this.size = 0;
	}	
	
	public int getSize() {
		return this.size;
	}
	
	public void addObjectToEnd(Object item) {
		// Agrega el item indicado al final de la lista enlazada, 
		// recorriendo recursivamente la misma,
		// si esta vacia lo asigna al primer elemento.
		try {assignNextObject(this.primero.getNext(), this.primero, item, this.size++);}
		catch (Exception e) {assignFirstNodo(new Nodo(item), this.size++);}
	}
	
	public Object getFirstObject() {
		try {return this.primero.getObject();} 
		catch (Exception e) {throw new AssertionError("Queue Empty");}
	}
	
	public void removeFirstObject() {
		try {assignFirstNodo(this.primero.getNext(), this.size--);} 
		catch (Exception e) {throw new AssertionError("Queue Empty");}
	}
	
	private void assignNextObject(Nodo nextNodo, Nodo currentNodo, Object item, int newSizeList) {
		try {assignNextObject(nextNodo.getNext(), nextNodo, item, newSizeList);} 
		catch (Exception e) {currentNodo.setNext(new Nodo(item));}
	}
	
	private void assignFirstNodo(Nodo newFirstNodo, int newSizeList) {
		this.primero = newFirstNodo;
	}
}
