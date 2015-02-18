package utility.collection;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayQueueTest {
	
	private QueueADT<String> stack;

	@Before
	public void setUp() throws Exception 
	{
		 System.out.println("Set up");
	      stack = new ArrayQueue<>();
	}

	@Test
	public void testEnqueue() 
	{
		stack.enqueue("A");
		  stack.enqueue("B");
		 
		  try
		  {
		    stack.enqueue(null);
		    stack.enqueue(null);
		    assertEquals(4, stack.size());
		    assertEquals(null, stack.dequeue());
		    assertEquals(null, stack.dequeue());
		    assertEquals("B", stack.dequeue());
		    assertEquals(1, stack.size());  
		  }
		  catch (IllegalArgumentException e) {/* OK  */}
		  catch (IllegalStateException e) {/* ok */}
		  catch (Exception e)
		  {
		    fail("Wrong exception type");
		  }
	}

	@Test
	public void testDequeue() 
	{
		stack.enqueue("A"); 
		  stack.enqueue("B");
		  assertFalse(stack.isEmpty());
		  stack.dequeue();
		 stack.dequeue();
		  assertTrue(stack.isEmpty());  
		  try
		  {
		    stack.enqueue(null);
		   
		  }
		  catch (IllegalStateException e){ /* ok */}
		  catch (Exception e)
		  {
		    fail("Wrong exception type");
		  }
	}

	/*@Test
	public void testFirst() 
	{
		fail("Not yet implemented");
	}

	@Test
	public void testIndexOf() 
	{
		fail("Not yet implemented");
	}

	@Test
	public void testIsEmpty() 
	{
		fail("Not yet implemented");
	}

	@Test
	public void testSize()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testToString()
	{
		fail("Not yet implemented");
	}
	*/
	@After
	public void tearDown() throws Exception 
	{
		 System.out.println("Tear down\n");
	}
}
