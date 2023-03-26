import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class testScanner {

	private String userInput = "";
	private ByteArrayInputStream bais;
	private ByteArrayOutputStream baos ;

	@Before
	public void initEach()
	{
		bais =new ByteArrayInputStream(userInput.getBytes());
		System.setIn(bais);

		baos = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(baos);
		System.setOut(printStream);
	}


	
	@Test
	//test the basic case if the number is 0 
	public void testcase0() {
		 userInput = "1";

		bais =new ByteArrayInputStream(userInput.getBytes());
		System.setIn(bais);


		String expected = "Enter a Number: "+"1";

		CountTotalDigits.main(null); // call the main method

		String[] lines = baos.toString().split(System.lineSeparator());
		String actual = lines[lines.length-1];

		// checkout output
		assertEquals(expected,actual);

	}
	@Test 
	//test1 test the basic case 
	public void testcase1() {
		userInput = "123";
		bais =new ByteArrayInputStream(userInput.getBytes());
		System.setIn(bais);


		String expected = "Enter a Number: "+"3";
		CountTotalDigits.main(null); // call the main method
		String[] lines = baos.toString().split(System.lineSeparator());
		String actual = lines[lines.length-1];

		// checkout output
		assertEquals(expected,actual);

	}


	@Test
	//test if there are zeros on the left
	public void testcase2() {
		userInput = "0123";
		bais =new ByteArrayInputStream(userInput.getBytes());
		System.setIn(bais);

		String expected = "Enter a Number: "+"3";

		CountTotalDigits.main(null); // call the main method

		String[] lines = baos.toString().split(System.lineSeparator());
		String actual = lines[lines.length-1];

		// checkout output
		assertEquals(expected,actual);

	}


	@Test
	//test if the are negative numbers 
	public void testcase3() {
		 userInput = "-1230";

		bais =new ByteArrayInputStream(userInput.getBytes());
		System.setIn(bais);


		String expected = "Enter a Number: "+"4";
		CountTotalDigits.main(null); // call the main method

		String[] lines = baos.toString().split(System.lineSeparator());
		String actual = lines[lines.length-1];

		// checkout output
		assertEquals(expected,actual);

	}


	@Test
	//test large numbers 
	public void testcase4() {
		 userInput = "12356789";
		bais =new ByteArrayInputStream(userInput.getBytes());
		System.setIn(bais);


		String expected = "Enter a Number: "+"8";

		CountTotalDigits.main(null); // call the main method

		String[] lines = baos.toString().split(System.lineSeparator());
		String actual = lines[lines.length-1];

		// checkout output
		assertEquals(expected,actual);

	}


	@Test
	//test if the digit is zero 
	public void testcase5() {
		 userInput = "0";
		bais =new ByteArrayInputStream(userInput.getBytes());
		System.setIn(bais);

		String expected = "Enter a Number: "+"0";

		CountTotalDigits.main(null); // call the main method

		String[] lines = baos.toString().split(System.lineSeparator());
		String actual = lines[lines.length-1];

		// checkout output
		assertEquals(expected,actual);

	}

	
}
