package spring.test.ch02;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class TestTwo {
	@Test
	public void test() {
		assertNotNull(new Date());
	}
}
