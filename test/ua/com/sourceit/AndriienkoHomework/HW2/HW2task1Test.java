package ua.com.sourceit.AndriienkoHomework.HW2;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

public class HW2task1Test {

	@Test
	public void testHW2task1() {
		try {
			new HW2task1();
		} catch (Exception e) {
			fail("Construction failed. ");
		}
	}

	@Rule
	public TextFromStandardInputStream systemInMock = TextFromStandardInputStream.emptyStandardInputStream();

	@Test
	public void test() throws Exception {
		systemInMock.provideLines("123qwe");
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		HW2task1.main(null);
		String n = System.getProperty("line.separator");

		assertEquals("1" + n + "2" + n + "3" + n + "q" + n + "w" + n + "e" + n, outContent.toString());
	}

}
