package arraypackage;

import java.util.Scanner;

public class NewLeapYearFebMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date");
		String date = sc.next();
		sc.close();
//		CheckDatepattern(date);
//		CheckLeapYearOrNot(date);
//		CheckLeapYearDateForFebuary(date);
		if(CheckLeapYearDateForFebuary(date)) {
			System.out.println(" yes it is date value");
		}else {
			System.out.println(" no it is not date value");
		}
	}

	private static boolean CheckLeapYearDateForFebuary(String date) {
		int dateValue = 0;
		int Month = 0;
		if (CheckDatepattern(date)) {
			Month = getMonth(date);
			dateValue = getDate(date);
		}
		if (CheckLeapYearOrNot(date)) {
			if (Month == 2) {
				if (dateValue <= 29) {
					return true;
				} else {
					return false;
				}
			}

		} else {

			if (Month == 2) {
				if (dateValue <= 28) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}

	public static int getDate(String date) {
		String[] dateArray = date.split("-");
		return Integer.parseInt(dateArray[dateArray.length - 3]);

	}

	public static int getMonth(String date) {
		String[] dateArray = date.split("-");
		return Integer.parseInt(dateArray[dateArray.length - 2]);

	}

	private static boolean CheckLeapYearOrNot(String date) {
		if (CheckDatepattern(date)) {
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

	static boolean CheckDatepattern(String date) {
		if (date.matches("^((0[1-9])|(1[0-9])|(2[0-9])|(3[0-1]))-((0[1-9])|(1[0-2]))-([0-9]{4})$")) {
			return true;
		} else {
			return false;
		}

	}
}
