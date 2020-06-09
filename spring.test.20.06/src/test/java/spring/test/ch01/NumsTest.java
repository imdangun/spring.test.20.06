package spring.test.ch01;

import java.util.Arrays;
import org.junit.Test;
import spring.test.ch01.Nums;
import static org.junit.Assert.assertEquals;

public class NumsTest {
	@Test
	public void testGetMax() {
		Nums nums = new Nums(Arrays.asList(1, 2, 3));
		assertEquals(3, nums.getMax());
	}
	
	@Test
	public void testGetMax2() {
		Nums nums = new Nums(Arrays.asList(1, 3, 2));
		assertEquals(3, nums.getMax());
	}
	
	@Test
	public void testGetMax3() {
		Nums nums = new Nums(Arrays.asList(-1, -2, -3));
		assertEquals(-1, nums.getMax());
	}
}
