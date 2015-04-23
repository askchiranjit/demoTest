import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class testModules
{
	Utils utils;
	
	@Before
	public void setup()
	{
		utils = new Utils();
	}
	
	@Test
	public void testAdd1()
	{
		double result = utils.add(3.2, 4.566);
		assertEquals(7.766, result, 0.01);
	}
	@Test
	public void testAdd2()
	{
		double result = utils.add(3, 999);
		assertEquals(1002, result, 0.01);
	}
	
	@Test
	public void testSubstract()
	{
		double result = utils.substract(8.2, 4.0);
		assertEquals(4.2, result, 0.01);
	}
	
	@Test
	public void testEvenOdd()
	{
		String output = utils.checkEvenOddForPositiveNo(511);
		assertEquals("Odd number", output);
	}
}
