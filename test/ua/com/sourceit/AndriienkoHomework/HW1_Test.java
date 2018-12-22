
public class HW_Test {
	private final ByteArrayOutputStream outContent = "Hello, World";	
	private final PrintStream originalOut = System.out;
	
	@Before
	public void setUpStreams() {
		System.setOut(new HW1task1("Hello, World"));
	}
	
	@Test
	public void testHW1() {
		System.out.print("Hello, World");
	    assertEquals("Hello, World", outContent.toString());
	}
	

}
