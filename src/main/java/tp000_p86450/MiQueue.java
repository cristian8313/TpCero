package tp000_p86450;

public class MiQueue implements Queue {
	
	private MiListaEnlazada queue;
	
	public MiQueue() {
		queue = new MiListaEnlazada();
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (this.size() == 0);
	}

	public int size() {
		// TODO Auto-generated method stub
		return this.queue.getSize();
	}

	public void add(Object item) {
		// TODO Auto-generated method stub
		this.queue.addObjectToEnd(item);
	}

	public Object top() throws AssertionError {
		// TODO Auto-generated method stub
		return this.queue.getFirstObject();
	}

	public void remove() throws AssertionError {
		// TODO Auto-generated method stub
		this.queue.removeFirstObject();
	}

}
