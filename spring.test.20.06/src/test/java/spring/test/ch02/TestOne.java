package spring.test.ch02;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.assertNotSame;

public class TestOne {
	@Test
	public void test() {
		assertNotSame(new Date(), new Date());
	}
}
