package spring.test.ch01;

import spring.test.ch01.home.Nums;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;

public class NumsTest2 {
	@Test
	public void testEmpty() {
		Nums nums = new Nums(new ArrayList<Integer>());
		assertEquals(1, nums.getMax());
	}
	
	@Test
	public void testEmpty2() {
		Nums2 nums = new Nums2(new ArrayList<Integer>());
		try {
			nums.getMax();
			fail("예외가 발생했습니다.");
		} catch(Exception e) {
			assertTrue(true);
		}
	}
}
