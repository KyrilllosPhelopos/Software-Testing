package sheet1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestQ2 {

	@Test
	//test case that doesn`t execute the fault 
	public void test1() {
	
		Q2_FindLast Q = new Q2_FindLast();
		int x[] = null;
		int y = 0;
		int actual = Q.findLast(x,y);//it will through a null pointer exception
		assertEquals(null, actual);
		
	}
	
	@Test
	//execute the fault but doesn`t result error state 
	public void test2() {
	
		Q2_FindLast Q = new Q2_FindLast();
		int x[] = {};
		int y = 1;
		int expected =-1 ;
		int actual = Q.findLast(x,y);
		assertEquals(expected, actual);
	}


@Test
//test case that results in an error, but not a failure.
public void test3() {

	Q2_FindLast Q = new Q2_FindLast();
	int x[] = {1,2,3};
	int y = 5;//search for a value that not in the array
	int expected =-1 ;
	int actual = Q.findLast(x,y);
	assertEquals(expected, actual);
}
}