package divicibilitycheck;

import java.util.Scanner;

public class DivisibilityBy12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		String StringValue = Sc.next();
		int firstNum = getNumber(StringValue.substring(0,1));
		int secondNum = getNumber(StringValue.substring(1,2));
		int thirdNum = getNumber(StringValue.substring(2,3));
		int fourthNum = getNumber(StringValue.substring(3,4));
		int fifthNum = getNumber(StringValue.substring(4,5));
		int sum = firstNum + secondNum + thirdNum + fourthNum + fifthNum ;
		System.out.println(sum);
		if(sum%3==0 && sum%4==0){
			System.out.println("Divisible by 12");
		}else {
			System.out.println("Not Divisible by 12");
			
			Sc.close();}	
			
			
		}
			
			
		
		public static int getNumber(String Value) {
		return Integer.parseInt(Value);}	
		
		public static int getLength(String value ) {
			return value.length();}
		
	}

