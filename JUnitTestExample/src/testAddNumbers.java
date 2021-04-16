import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitTesting f = new jUnitTesting();
		int r = f.addNumbers(1, 3);
		assertEquals(r,4);
	}

}
