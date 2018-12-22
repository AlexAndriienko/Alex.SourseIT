package ua.com.sourceit.AndriienkoHomework.HW1;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class HW1task5Test {
	
	@Before
	
	
	@Test
	public void testHW1task5() {
		try {
			new HW1task5();
		} catch (Exception e) {
			fail("Construction failed. ");
		}
	}
	
	@Test
	public void testMainHW1task5() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		HW1task5.main(null);
		System.getProperty("line.separator");
		assertEquals("754" + System.getProperty("line.separator") + "ABZ" + System.getProperty("line.separator") + "ACA" + System.getProperty("line.separator"), outContent.toString());
	}
	
	
	@Test
	public void testChars2digits() {		
		assertEquals(703, HW1task5.chars2digits("AAA"));
	}
	
	@Test
	public void testDigits2chars() {
		assertEquals("ZZZ", HW1task5.digits2chars(18278));
		assertEquals("KS", HW1task5.digits2chars(305));
	}
	
	@Test
	public void testRightColumn() {
		assertEquals("ACA", HW1task5.rightColumn("ABZ"));
	}

}
