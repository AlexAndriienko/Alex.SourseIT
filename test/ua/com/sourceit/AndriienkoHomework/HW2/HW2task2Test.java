package ua.com.sourceit.AndriienkoHomework.HW2;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

public class HW2task2Test {

	@Test
	public void testHW2task2() {
		try {
			new HW2task2();
		} catch (Exception e) {
			fail("Construction failed. ");
		}
	}
	
	@Rule
	public TextFromStandardInputStream systemInMock = TextFromStandardInputStream.emptyStandardInputStream();

	@Test
	public void testCalcAreaTriangle() throws Exception {
		systemInMock.provideLines("4", "5", "6");
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		HW2task2.main(null);
		String n = System.getProperty("line.separator");

		assertEquals("a = b = c = S = 9.92" + n, outContent.toString());
	}

}
