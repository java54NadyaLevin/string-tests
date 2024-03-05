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
		assertTrue(hello.compareToIgnoreCase("(ello") == 64); //? This is for toLowerCase method. But as far as I understood, for some locales toUpperCase method is used.
		assertTrue(hello.compareToIgnoreCase("Hellо") != 0); // "o" is cyrillic = unicode value differs.
	
	}

	
	@Test
	@DisplayName("test of the startsWith method")
	void startsWithTest() {
		String hello = "Hello";
		assertTrue(hello.startsWith("H"));
		assertFalse(hello.startsWith("J"));
		assertTrue(hello.startsWith(""));
		assertFalse(hello.startsWith("h"));
		
	}
	
	@Test
	@DisplayName("test of the endsWith method")
	void endsWithTest() {
		String hello = "Hello";
		assertTrue(hello.endsWith("o"));
		assertFalse(hello.endsWith("j"));
		assertTrue(hello.endsWith(""));
		assertFalse(hello.endsWith("O"));
		
	}
	
	@Test
	@DisplayName("test of the equalsIgnoreCase method")
	void equalsIgnoreCaseTest() {
		String hello = "Hello";
		assertTrue(hello.equalsIgnoreCase("hElLo"));
		assertFalse(hello.equalsIgnoreCase(null));
		assertFalse(hello.equalsIgnoreCase("Hello "));

	}
	
	@Test
	@DisplayName("test of the indexOf method")
	void indexOfTest() {
		String hello = "Hello";
		assertTrue(hello.indexOf("ol") == -1);
		assertFalse(hello.indexOf("h") == 0);
		assertTrue(hello.indexOf("lo") == 3);
		assertTrue(hello.indexOf("l") == 2);
		
	}
	
	@Test
	@DisplayName("test of the lastIndexOf(ch) method")
	void lastIndexOfTest() {
		String hello = "Hello";
		assertTrue(hello.lastIndexOf('H') == 0);
		assertTrue(hello.lastIndexOf('h') == -1);
		assertTrue(hello.lastIndexOf('l') == 3);
		
	}

}
