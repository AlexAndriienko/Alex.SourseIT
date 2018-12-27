package ua.com.sourceit.AndriienkoHomework.HW2;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

public class HW2task3Test {
	
	@Test
	public void testHW2task3() {
		try {
			new HW2task3();
		} catch (Exception e) {
			fail("Construction failed. ");
		}
	}
	
	@Rule
	public TextFromStandardInputStream systemInMock = TextFromStandardInputStream.emptyStandardInputStream();

	@Test
	public void testCalcAreaСircle() throws Exception {
		systemInMock.provideLines("5");
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		HW2task3.main(null);
		String n = System.getProperty("line.separator");

		assertEquals("Введите радиус:\nR = S = 31.42" + n, outContent.toString());
	}

}
