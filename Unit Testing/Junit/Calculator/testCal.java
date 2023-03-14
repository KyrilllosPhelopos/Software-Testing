package unit_Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCal {

	@Test
	public void test() {
		Calculator cal = new Calculator();
		int actual = cal.add(5, 2);
		assertEquals(8, actual);
		
	}

}
