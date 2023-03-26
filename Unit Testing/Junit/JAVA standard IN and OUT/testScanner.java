import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class testScanner {



	@Test
	public void testcase1() {
		String userInput = "123";

		ByteArrayInputStream bais =new ByteArrayInputStream(userInput.getBytes());
		System.setIn(bais);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(baos);
		System.setOut(printStream);
		
		String expected = "Enter a Number: "+"3";
		CountTotalDigits.main(null); // call the main method
		String[] lines = baos.toString().split(System.lineSeparator());
		String actual = lines[lines.length-1];

		// checkout output
		assertEquals(expected,actual);

	}


	@Test
	public void testcase2() {
		String userInput = "0123";
		String expected = "Enter a Number: "+"3";
		
		ByteArrayInputStream bais =new ByteArrayInputStream(userInput.getBytes());
		System.setIn(bais);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(baos);
		System.setOut(printStream);

		CountTotalDigits.main(null); // call the main method

		String[] lines = baos.toString().split(System.lineSeparator());
		String actual = lines[lines.length-1];

		// checkout output
		assertEquals(expected,actual);

	}


	@Test
	public void testcase3() {
		String userInput = "-123";
		
		ByteArrayInputStream bais =new ByteArrayInputStream(userInput.getBytes());
		System.setIn(bais);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(baos);
		System.setOut(printStream);
		
		String expected = "Enter a Number: "+"3";
		CountTotalDigits.main(null); // call the main method

		String[] lines = baos.toString().split(System.lineSeparator());
		String actual = lines[lines.length-1];

		// checkout output
		assertEquals(expected,actual);

	}


	@Test
	public void testcase4() {
		String userInput = "12356789";
		
		ByteArrayInputStream bais =new ByteArrayInputStream(userInput.getBytes());
		System.setIn(bais);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(baos);
		System.setOut(printStream);
		
		String expected = "Enter a Number: "+"8";

		CountTotalDigits.main(null); // call the main method

		String[] lines = baos.toString().split(System.lineSeparator());
		String actual = lines[lines.length-1];

		// checkout output
		assertEquals(expected,actual);

	}


	@Test
	public void testcase5() {
		String userInput = "0";
		
		ByteArrayInputStream bais =new ByteArrayInputStream(userInput.getBytes());
		System.setIn(bais);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(baos);
		System.setOut(printStream);

		String expected = "Enter a Number: "+"0";

		CountTotalDigits.main(null); // call the main method

		String[] lines = baos.toString().split(System.lineSeparator());
		String actual = lines[lines.length-1];

		// checkout output
		assertEquals(expected,actual);

	}

	@Test
	public void testcase6() {
		String userInput = "1";
		
		ByteArrayInputStream bais =new ByteArrayInputStream(userInput.getBytes());
		System.setIn(bais);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(baos);
		System.setOut(printStream);

		String expected = "Enter a Number: "+"1";

		CountTotalDigits.main(null); // call the main method

		String[] lines = baos.toString().split(System.lineSeparator());
		String actual = lines[lines.length-1];

		// checkout output
		assertEquals(expected,actual);

	}
}
