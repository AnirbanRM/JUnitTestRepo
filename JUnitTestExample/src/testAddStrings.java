import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitTesting f = new jUnitTesting();
		String r = f.addStrings("Hello", "Hi");
		assertEquals(r,"HelloHi");
	}

}
