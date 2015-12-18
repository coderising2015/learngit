package zdSales;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSayHello() {
		assertEquals("Hello World", new HelloWorld().sayHello());
		
	}

}
