package initialProject;

import static org.junit.Assert.*;

import org.junit.Test;



public class MeirHelloTest {

	@Test
	public void testHello() {
		String result = new MeirHello().hello(); 
		assertTrue("ppoo", "Helloo".equals(result));//  --Equals("Helloo", result);
		
	}

}
