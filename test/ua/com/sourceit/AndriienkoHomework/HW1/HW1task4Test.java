package ua.com.sourceit.AndriienkoHomework.HW1;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class HW1task4Test {

	@Test
	public void testHW1task4() {
		try {
			new HW1task4();
		} catch (Exception e) {
			fail("Construction failed. ");
		}
	}

	@Test
	public void testMainHW1task4() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		String[] checkInt = {"12345678910"};
		HW1task4.main(checkInt);

		System.getProperty("line.separator");
		assertEquals("Сумма цифр равна: 46" + System.getProperty("line.separator"), outContent.toString());
	}

}
