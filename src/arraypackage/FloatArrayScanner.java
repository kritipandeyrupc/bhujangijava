package arraypackage;

import java.util.Arrays;
import java.util.Scanner;

public class FloatArrayScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Float Number");

		Float[] floatNumber = new Float[5];

		floatNumber[0] = sc.nextFloat();
		floatNumber[1] = sc.nextFloat();
		floatNumber[2] = sc.nextFloat();
		floatNumber[3] = sc.nextFloat();
		floatNumber[4] = sc.nextFloat();

		System.out.println(Arrays.toString(floatNumber));

	}

}
