package ua.com.sourceit.AndriienkoHomework.HW1;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import org.junit.Test;

public class HW1task1Test {

	@Test
	public void testHW1task1() {
		try {
			new HW1task1();
		} catch (Exception e) {
			fail("Construction failed. ");
		}
	}

	@Test
	public void testMainHW1task1() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		HW1task1.main(null);

		System.getProperty("line.separator");
		assertEquals("Hello, World" + System.getProperty("line.separator"), outContent.toString());
	}

}