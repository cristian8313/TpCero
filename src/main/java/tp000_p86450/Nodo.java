package tp000_p86450;

public class Nodo {
	
	private Nodo next = null;
	private Object item;

	public Nodo(Object item) {
		// TODO Auto-generated constructor stub
		this.item = item;
	}

	public void setNext(Nodo next) {
		// TODO Auto-generated method stub
		this.next = next;
	}

	public Object getObject() {
		// TODO Auto-generated method stub
		return this.item;
	}

	public Nodo getNext() {
		// TODO Auto-generated method stub
		return this.next;
	}

}
