import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyClassTest {

	@Test
	void testAddition() {
		
		int expected = 3;
		
		MyClass myClass = new MyClass();
		int actual = myClass.addition(1, 2);
		
		assertEquals(expected, actual);
		
	}

	@Test
	void testAdditionAgain() {
		
		int expected = 4;
		
		MyClass myClass = new MyClass();
		int actual = myClass.addition(2, 2);
		
		assertEquals(expected, actual);
		
	}
	
	
}
