package divicibilitycheck;

import java.util.Scanner;

public class DivisibilityBy13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		String stringValue = sc.next();
		String firstfourNumber = stringValue.substring(0,4);
		System.out.println(firstfourNumber);     //2345
		int lastNumber = Integer.parseInt(firstfourNumber.substring(firstfourNumber.length()-1));
		System.out.println(lastNumber);
		int multiplebyFour = lastNumber * 4;
		System.out.println(multiplebyFour);
		int restNumber = Integer.parseInt(firstfourNumber.substring(0,3));
		System.out.println(restNumber);
		int sum = restNumber + multiplebyFour;
		System.out.println(sum);
	if(sum%13 ==0) {
System.out.println("it is divisible by 13");
}else {
	System.out.println("it is not divisible by 13");
		
}}}