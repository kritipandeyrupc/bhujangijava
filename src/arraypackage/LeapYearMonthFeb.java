package arraypackage;

import java.util.Scanner;

public class LeapYearMonthFeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the date ");
		String date = sc.next();
		CheckDatePattarn(date);
		CheckLeapyearOrNot(date);
		CheckLeapyeardateForFebuary(date);
		if (CheckLeapyeardateForFebuary(date)) {
			System.out.println("it is valid date");
		} else {
			System.out.println("it is not valid date");
		}
	}

	private static boolean CheckLeapyeardateForFebuary(String date) {// no3 check
		int datevalue = 0;
		int month = 0;

		month = getMonth(date);
		datevalue = getDate(date);

		if (CheckLeapyearOrNot(date)) {
			if (month == 2) {
				if (datevalue <= 29) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {

		}
		if (month == 2) {
			if (datevalue <= 28) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	private static int getDate(String date) {
		// TODO Auto-generated method stub
		String[] dateArray = date.split("-");
		return Integer.parseInt(dateArray[dateArray.length - 3]);
	}

	private static int getMonth(String date) {
		// TODO Auto-generated method stub
		String[] dateArray = date.split("-");
		return Integer.parseInt(dateArray[dateArray.length - 2]);
	}

	private static boolean CheckLeapyearOrNot(String date) {// no2 check
		// TODO Auto-generated method stub
		if (CheckDatePattarn(date)) {
			String[] dateArray = date.split("-");
			int year = Integer.parseInt(dateArray[dateArray.length - 1]);

			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						return true;
					} else {
						return false;
					}

				} else {
					return true;
				}

			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	private static boolean CheckDatePattarn(String date) {// no1check
		// TODO Auto-generated method stub
		if (date.matches("^((0[1-9])|(1[0-9])|(2[0-9])|(3[0-1]))-((0[1-9])|(1[0-2]))-([0-9]{4})$")) {
			return true;
		} else {
			return false;
		}

	}
}
