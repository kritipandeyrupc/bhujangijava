package divicibilitycheck;

import java.util.Scanner;

public class DivisibleBy7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		String stringvalue = sc.next();
		String firstfiveNumber = stringvalue.substring(0,5); // 12345
		int lastNumber = Integer.parseInt(firstfiveNumber.substring(firstfiveNumber.length()-1));
		System.out.println(lastNumber);
		int multiplebyTwo = lastNumber * 2;
		System.out.println(multiplebyTwo);
		int restNumber = Integer.parseInt(firstfiveNumber.substring(0,4));
		System.out.println(restNumber);
		int minusvalue = restNumber - multiplebyTwo;
		System.out.println(minusvalue);
		
		String firstfourthNumber = stringvalue.substring(0,4);
		
		int secondminusvaluelastNumber = Integer.parseInt(firstfourthNumber.substring(3,4));
		System.out.println(secondminusvaluelastNumber);
		int secondminusvaluemultiplebyTwo = secondminusvaluelastNumber * 2;
		System.out.println(secondminusvaluemultiplebyTwo);
		int secondminusvaluerestNumber = Integer.parseInt(firstfourthNumber.substring(0,3));
		System.out.println(secondminusvaluerestNumber);
		int thirdminusvalue = secondminusvaluerestNumber - secondminusvaluemultiplebyTwo;
		System.out.println(thirdminusvalue);
		
		
		
		if (thirdminusvalue % 7 == 0) {
			System.out.println("Divisible by 7");
		} else {
			System.out.println("Not Divisible by 7");

			sc.close();
		}

	}

}
