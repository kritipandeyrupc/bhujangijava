package arraypackage;

import java.util.Arrays;
import java.util.Scanner;

public class IntArrayScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
System.out.println("Enter the Number");

int [] intNumber = new int[5];
intNumber [0 ]= sc.nextInt();
intNumber [1] = sc.nextInt();
intNumber [2] = sc.nextInt();
intNumber [3] = sc.nextInt();
intNumber [4] = sc.nextInt();

System.out.println(Arrays.toString(intNumber));


	}

}
