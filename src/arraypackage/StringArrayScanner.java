package arraypackage;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrayScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the string");
		
		String []playerNames = new String [4];
		playerNames [0] = sc.next();
		playerNames [1] = sc.next();
		playerNames [2] = sc.next();
		playerNames [3] = sc.next();
		
		System.out.println(Arrays.toString(playerNames));
		
		
	}
	

}
