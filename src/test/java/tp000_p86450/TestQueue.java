package tp000_p86450;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestQueue {

	@Test
	public void testCreateQueue() {
		Queue miQueue = new MiQueue();
		assertNotNull("Queue can't create", miQueue);
	}
	
	@Test
	public void testEmptyQueue() {
		Queue miQueue = new MiQueue();
		assertTrue("Not Empty Queue", miQueue.isEmpty());
	}
	
	@Test
	public void testNotEmptyQueue() {
		Queue miQueue = new MiQueue();
		miQueue.add(new Object());
		assertFalse("Empty Queue", miQueue.isEmpty());
	}
	
	@Test
	public void testSizeZeroQueue() {
		Queue miQueue = new MiQueue();
		assertEquals("Fail check size", 0, miQueue.size());
	}
	
	@Test
	public void testSizeNonZeroQueue() {
		Queue miQueue = new MiQueue();
		miQueue.add(new Object());
		assertEquals("Fail check size", 1, miQueue.size());
		miQueue.add(new Object());
		assertEquals("Fail check size", 2, miQueue.size());
		miQueue.add(new Object());
		assertEquals("Fail check size", 3, miQueue.size());
		miQueue.add(new Object());
		assertEquals("Fail check size", 4, miQueue.size());
	}
	
	@Test
	public void testAddObjectQueue() {
		Queue miQueue = new MiQueue();
		miQueue.add(new String("elemento 1"));
		assertEquals("Fail element not added", 1, miQueue.size());
		assertEquals("Fail element not save correctly", "elemento 1", miQueue.top().toString());
	}
	
	@Test (expected=AssertionError.class)
	public void testTopObjectEmptyQueue() {
		Queue miQueue = new MiQueue();
		miQueue.top();
	}
	
	@Test 
	public void testTopObjectNotEmptyQueue() {
		Queue miQueue = new MiQueue();
		miQueue.add(new String("elemento 1"));
		miQueue.add(new String("elemento 2"));
		miQueue.add(new String("elemento 3"));
		miQueue.add(new String("elemento 4"));
		assertEquals("Fail get a diferent element", "elemento 1", miQueue.top().toString());
	}
	
	@Test (expected=AssertionError.class)
	public void testRemoveObjectEmptyQueue() {
		Queue miQueue = new MiQueue();		
		miQueue.remove();
	}
	
	@Test
	public void testRemoveObjectNotEmptyQueue() {
		Queue miQueue = new MiQueue();
		miQueue.add(new String("elemento 1"));
		miQueue.add(new String("elemento 2"));
		miQueue.add(new String("elemento 3"));
		miQueue.add(new String("elemento 4"));
		miQueue.remove();
		assertEquals("Fail element not removed", 3, miQueue.size());
		assertEquals("Fail get a diferent element", "elemento 2", miQueue.top().toString());
		miQueue.remove();
		assertEquals("Fail element not removed", 2, miQueue.size());
		assertEquals("Fail get a diferent element", "elemento 3", miQueue.top().toString());
		miQueue.remove();
		assertEquals("Fail element not removed", 1, miQueue.size());
		assertEquals("Fail get a diferent element", "elemento 4", miQueue.top().toString());
		miQueue.remove();
		assertEquals("Fail element not removed", 0, miQueue.size());
	}
}
