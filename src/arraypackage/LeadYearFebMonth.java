package arraypackage;

import java.util.Scanner;

public class LeadYearFebMonth {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date");
		String date = sc.next();
		if (checkleapYearForFebuary(date)) {
			System.out.println("it is valid date");
		} else {
			System.out.println("it is not valid date");
		}

		sc.close();
	}

	private static boolean checkleapYearForFebuary(String date) {

		int datevalue = 0;
		int month = 0;
		if (CheckDatePattarn(date)) {
			month = getmonth(date);
			datevalue = getdate(date);
		}
		if (CheckLeapYearOrNot(date)) {
			if (month == 2) {
				if (datevalue <= 29) {
					return true;
				} else {
					return false;
				}
			}

		} else {
			if (month == 2) {
				if (datevalue <= 28) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}

	public static int getdate(String date) {
		String[] dateArray = date.split("-");
		return Integer.parseInt(dateArray[dateArray.length - 3]);

	}

	public static int getmonth(String date) {
		String[] dateArray = date.split("-");
		return Integer.parseInt(dateArray[dateArray.length - 2]);
	}

	private static boolean CheckLeapYearOrNot(String date) {
		// TODO Auto-generated method stub
		if (CheckDatePattarn(date)) {
			String[] dateArray = date.split("-");
			int year = Integer.parseInt(dateArray[dateArray.length - 1]);
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 100 == 0) {
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

	private static boolean CheckDatePattarn(String date) {
		// TODO Auto-generated method stub
		if (date.matches("^((0[1-9])|(1[0-9])|(2[0-9])|(3[0-1]))-((0[0-9])(1[0-2]))-([0-9]{4})$")) {
			return true;
		} else {
			return false;
		}
	}
}
