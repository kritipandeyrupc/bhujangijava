package divicibilitycheck;

import java.util.Scanner;

public class DivisibilityBy9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		String stringvalue = sc.next();
		String firstfourNumber = stringvalue.substring(0, 4);
		int firstNumber = Integer.parseInt(firstfourNumber.substring(0, 1));
		int secondNumber = Integer.parseInt(firstfourNumber.substring(1, 2));
		int thirdNumber = Integer.parseInt(firstfourNumber.substring(2, 3));
		int fourthtNumber = Integer.parseInt(firstfourNumber.substring(3, 4));
		int sum = firstNumber + secondNumber + thirdNumber + fourthtNumber;
		System.out.println(sum);
		if (sum % 9 == 0) {
			System.out.println("Divisible by 9 ");
		} else {
			System.out.println("Not Divisible by 9");

			sc.close();

		}
	}
}
