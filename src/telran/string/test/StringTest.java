package telran.string.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import static java.lang.String.*;
import org.junit.jupiter.api.Test;


class StringTest {

	@Test
	@DisplayName("test of the concat method")
	void concatTest() {
		String hello = "Hello";
		assertEquals("Hello World!!", hello.concat(" World!").concat("!"));
				
	}
	
	@Test
	@DisplayName("test of the contains method")
	void containsTest() {
		String hello = "Hello";
		assertTrue(hello.contains("ell"));
		assertFalse(hello.contains("lll"));
	
	}
	
	@Test
	@DisplayName("test of the compareTo method")
	void compareToTest() {
		String hello = "Hello";
		
		assertTrue(hello.compareTo("Hello") == 0);
		assertTrue(hello.compareTo("Hello ") == -1);
		assertTrue(hello.compareTo("Hell") == 1);
		assertTrue(hello.compareTo("hello") == -32);
		assertTrue(hello.compareTo("(ello") == 32);
		assertTrue(hello.compareTo("Hellо") != 0); // "o" is cyrillic = unicode value differs.
	
	}
	
	@Test
	@DisplayName("test of the compareToIgnoreCase method")
	void compareToIgnoreCaseTest() {
		String hello = "Hello";
	
		assertTrue(hello.compareToIgnoreCase("hello") == 0);
		assertTrue(hello.compareToIgnoreCase("hello ") == -1);
		assertTrue(hello.compareToIgnoreCase("hell") == 1);
		assertTrue(hello.compareToIgnoreCase("(ello") == 64); //? This is for toLowerCase method. But for some locales toUpperCase method is used.
		assertTrue(hello.compareToIgnoreCase("Hellо") != 0); // "o" is cyrillic = unicode value differs.
	
	}


}
