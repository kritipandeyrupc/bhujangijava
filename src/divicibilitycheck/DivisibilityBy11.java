package divicibilitycheck;

import java.util.Scanner;

public class DivisibilityBy11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		String stringvalue = sc.next();
		String firstfournumber = stringvalue.substring(0, 4);
		System.out.println(firstfournumber);
		String lastNumber = firstfournumber.substring(getLength(firstfournumber) - 2);
		System.out.println(lastNumber);
		int intNumber = getNumber(lastNumber);

		int restNumber = getNumber(stringvalue.substring(0, 2));
		int sum = intNumber + restNumber;
		System.out.println(sum);
		if (sum % 11 == 0) {
			System.out.println("Divisible by eleven");

		} else {
			System.out.println("Not divisible by eleven");
		}
		sc.close();
	}

	public static int getNumber(String value) {
		return Integer.parseInt(value);
	}

	public static int getLength(String value) {
		return value.length();
	}

}
