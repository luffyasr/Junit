package JUnitTestingPac;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Addnum {

	@Test
	void test() {
		JUnitFunction junit= new JUnitFunction();
		int result = junit.addnumbers(250, 250);
		assertEquals(500,result);
	}

}
