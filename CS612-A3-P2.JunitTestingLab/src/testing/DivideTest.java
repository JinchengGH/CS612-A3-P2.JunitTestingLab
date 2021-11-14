package testing;

import static org.junit.Assert.*;
import org.junit.Test;

public class DivideTest {

	@Test
	public void test() {
		JunitTesting junitTesting = new JunitTesting();
		double output = junitTesting.divide(10, 4);
		assertEquals(2.5, output);
	}

}
