package arraypackage;

import java.util.Scanner;

public class LeapYearArrayPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date");
		String date = sc.next();
		CheckDatePattarn(date);
		CheckLeapyearOrNOT(date);
	}

	private static void CheckLeapyearOrNOT(String date) {
		// TODO Auto-generated method stub
		String[] dateArray = date.split("-");
		int year = Integer.parseInt(dateArray[dateArray.length - 1]);
//2024
		if (year % 4 == 0) {
			if (year % 100 == 0) {

				if (year % 400 == 0) {
					System.out.println("yes it is leap year");
				}else {
					System.out.println("it is not leap year");
				}
			} 

		}else {
			System.out.println("it is not leap year");
		}
	}

	
	private static void CheckDatePattarn(String date) {
		// TODO Auto-generated method stub
		if (date.matches("^((0[1-9])|(1[0-9])|(2[0-9])|(3[0-1]))-((0[1-9])|(1[0-2]))-([0-9]{4})$")) {
			System.out.println("yes it is date pattarn");
		} else {
			System.out.println("no it is not date pattarn");
		}
	}

}
