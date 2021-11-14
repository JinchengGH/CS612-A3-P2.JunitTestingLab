package testing;

import static org.junit.Assert.*;
import org.junit.Test;

public class CountTest {

	@Test
	public void test() {
		JunitTesting junitTesting = new JunitTesting();
		int output = junitTesting.count("apple");
		assertEquals(1, output);
	}

}
