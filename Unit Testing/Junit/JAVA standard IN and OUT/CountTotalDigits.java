import java.util.Scanner;


public class CountTotalDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, totalDigits=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		num = s.nextInt();
		while(num!=0)
		{
			totalDigits++;
			num = num/10;
		}
		System.out.print(totalDigits);
		s.close();

	}

}
