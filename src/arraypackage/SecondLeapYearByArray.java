package arraypackage;

import java.util.Scanner;

public class SecondLeapYearByArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String year");
		String date = sc.next();
		CheckDatePattarn(date);
		CheckLeapearOrNot(date);

	}

	private static void CheckLeapearOrNot(String date) {
		// TODO Auto-generated method stub
		
		String[]dateArray = date.split("-");
		int year = Integer.parseInt(dateArray[dateArray.length-1]);
		if(year%4==0) {
		if(year%100==0) {	//1900--->not leap year
		if(year%400==0)	{
			System.out.println("leap yaer");
		}else {
			System.out.println("not leap year");}
			
			
			
		}else {System.out.println("leap year");	}
			
		}else {System.out.println("not leap year");	}
			
			
		}

	private static void CheckDatePattarn(String date) {
		// TODO Auto-generated method stub
		if (date.matches("^((0[1-9])|(1[0-9])|(2[0-9])|(3[0-1]))-((0[1-9])|(1[0-2]))-([0-9]{4})$")) {
			System.out.println("yes it is date pattarn ");
		} else {
			System.out.println("No it is notdate pattarn");
		}

	}
}
