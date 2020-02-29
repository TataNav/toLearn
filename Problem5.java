/*
 * Given an array of chars an one char, count how many times that char occurs in the array.
 */
public class Problem5 {
	public static void main(String[] args) {
		char arr[] = new char[] {'s', 'p', 'k', 's', 'o', 't', 'S', 's'};
		char c = 's';
		
		int counter = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == c) {
				counter += 1;
			}
		}
		System.out.println(counter);
	}
}
