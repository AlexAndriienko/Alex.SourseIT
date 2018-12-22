package ua.com.sourceit.AndriienkoHomework.HW1;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class HW1task2Test {
	@Test
	public void testHW1task2() {
		try {
			new HW1task2();
		} catch (Exception e) {
			fail("Construction failed. ");
		}
	}

	@Test
	public void testMainHW1task2() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		String[] checkInt = {"3", "11"};
		HW1task2.main(checkInt);

		System.getProperty("line.separator");
		assertEquals("Сумма равна: 14" + System.getProperty("line.separator"), outContent.toString());
	}

}
