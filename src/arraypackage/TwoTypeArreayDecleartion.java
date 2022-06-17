package arraypackage;

import java.util.Arrays;

public class TwoTypeArreayDecleartion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] animalnames = {"dog","horse","donkey","elephant"}; 
		System.out.println(Arrays.toString(animalnames));
		
		String [] animalnamesArray  = new String[4];
		
		animalnamesArray[0] = "horse";
		animalnamesArray[1] = "donkey";
		animalnamesArray[2] = "dog";
		animalnamesArray[3] = "elephant";
		System.out.println(Arrays.toString(animalnamesArray));
	}

}
