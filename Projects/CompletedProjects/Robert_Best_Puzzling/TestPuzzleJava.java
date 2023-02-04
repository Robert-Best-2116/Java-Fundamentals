

import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);

		
    	//..
		// Write your other test cases here.
		//..
        String randomLetter = generator.letterGetter();
        System.out.println(randomLetter);

		String password = generator.passwordGenerator();
		System.out.println(password);

		System.out.println(generator.passwordGroups(5));
	}
}