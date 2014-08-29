package tp000_p86450;

public class Nodo {
	
	private Nodo next = null;
	private Object item;

	public Nodo(Object item) {
		this.item = item;
	}

	public void setNext(Nodo next) {
		this.next = next;
	}

	public Object getObject() {
		return this.item;
	}

	public Nodo getNext() {
		return this.next;
	}

}
