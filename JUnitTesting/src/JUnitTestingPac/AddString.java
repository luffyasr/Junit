package JUnitTestingPac;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddString {

	@Test
	void test() {
		JUnitFunction junitString= new JUnitFunction();
		String result = junitString.addStrings("Hello", "Guys");
		assertEquals("HelloGuy",result);
		
	}

}
