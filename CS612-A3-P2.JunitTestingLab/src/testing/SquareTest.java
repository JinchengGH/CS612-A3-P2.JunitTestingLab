package testing;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquareTest {

	@Test
	public void test() {
		JunitTesting junitTesting = new JunitTesting();
		int output = junitTesting.square(5);
		assertEquals(25, output);
	}

}
