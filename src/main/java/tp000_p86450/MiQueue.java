package tp000_p86450;

public class MiQueue implements Queue {
	
	private MiListaEnlazada queue;
	
	public MiQueue() {
		queue = new MiListaEnlazada();
	}

	public boolean isEmpty() {
		return (this.size() == 0);
	}

	public int size() {
		return this.queue.getSize();
	}

	public void add(Object item) {
		this.queue.addObjectToEnd(item);
	}

	public Object top() throws AssertionError {
		return this.queue.getFirstObject();
	}

	public void remove() throws AssertionError {
		this.queue.removeFirstObject();
	}

}
