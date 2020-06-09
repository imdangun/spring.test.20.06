package spring.test.ch01.home;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumsTest {
	@Test
	public void testGetMax() {
		Nums nums = new Nums(Arrays.asList(-1, -2, -3));
		assertEquals(-1, nums.getMax());
	}
}
