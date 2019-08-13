
import java.util.*;

public class isPalindrome {
	
	public static boolean isPal(String phrase) {
		ArrayList<Character> arr = new ArrayList<Character>();
		int list_length = phrase.length() - 1;
		int counter = list_length;
		while (counter >= 0) {
			arr.add(phrase.charAt(counter));
			counter--;
		}
		
		counter = 0;
		
		while (counter <= list_length) {
			if (phrase.charAt(counter) != arr.get(counter)) {
				return false;
			}
			counter++;
		}
		return true;
		
	}
	
	public static void main(String args[]) {
		
		String phrase = "gohangasalamiimalasagnahog";
		System.out.println(isPal(phrase));
		
	}

}
