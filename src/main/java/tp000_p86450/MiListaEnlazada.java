package tp000_p86450;

public class MiListaEnlazada {
	private Nodo primero = null;
	private int size;
		
	public MiListaEnlazada() {
		this.size = 0;
	}	
	
	public int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}
	
	public void addObjectToEnd(Object item) {
		// TODO Auto-generated method stub
		try {addNextObject(this.primero.getNext(), this.primero, item, this.size++);} catch (Exception e) {addFirstObject(item, this.size++);}
	}
	
	private void addNextObject(Nodo nextNodo, Nodo currentNodo, Object item, int newSizeList) {
		try {addNextObject(nextNodo.getNext(), nextNodo, item, newSizeList);} catch (Exception e) {currentNodo.setNext(new Nodo(item));}
	}
	
	private void addFirstObject(Object item, int newSizeList) {
		// TODO Auto-generated method stub
		this.primero = new Nodo(item);
	}
	
	public Object getFirstObject() {
		// TODO Auto-generated method stub
		try {return this.primero.getObject();} catch (Exception e) {throw new AssertionError("Queue Empty");}
	}
	
	public void removeFirstObject() {
		// TODO Auto-generated method stub
		try {replaceFirstNodo(this.primero.getNext(), this.size--);} catch (Exception e) {throw new AssertionError("Queue Empty");}
	}
	
	private void replaceFirstNodo(Nodo newFirstNodo, int newSizeList) {
		// TODO Auto-generated method stub
		this.primero = newFirstNodo;
	}
}
