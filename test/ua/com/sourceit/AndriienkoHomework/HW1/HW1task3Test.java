package ua.com.sourceit.AndriienkoHomework.HW1;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class HW1task3Test {

	@Test
	public void testHW1task3() {
		try {
			new HW1task3();
		} catch (Exception e) {
			fail("Construction failed. ");
		}
	}

	@Test
	public void testMainHW1task3() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		String[] checkInt = {"20", "55"};
		HW1task3.main(checkInt);

		System.getProperty("line.separator");
		assertEquals("НОД равен: 5" + System.getProperty("line.separator"), outContent.toString());
	}


}
