package ap.demo;
import static org.junit.Assert.*;

import org.junit.Test;

public class MyOperationsTest {

	@Test
	public void testAdd() {
		assertEquals(8,new MyOperations().add(3, 5));
	}

}
