package sheet1;

public class Q2_FindLast {

	public int findLast (int[] x, int y) {
		//Effects: If x==null throw NullPointerException
		// else return the index of the last element
		// in x that equals y.
		// If no such element exists, return -1
		for (int i=x.length-1; i > 0; i--)
		{
			if (x[i] == y)
			{
				return i;
			}
		}
		return -1;

	}
}

