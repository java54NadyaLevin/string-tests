package telran.string.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import static java.lang.String.*;
import org.junit.jupiter.api.Test;


class StringTest {

	@Test
	@DisplayName("test of the method concat")
	void concatTest() {
		String hello = "Hello";
		assertEquals("Hello World!!", hello.concat(" World!").concat("!"));
				
	}
	
	void containsTest() {
		String hello = "Hello";
		assertTrue(hello.contains("ell"));
		assertFalse(hello.contains("lll"));
	}

}
