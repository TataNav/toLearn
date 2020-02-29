/*
 * Given an array of strings and one string, find that string in the array or print "Not found" if there is no such string in the array.
 */
public class Problem3 {
	public static void main(String[] args) {
		String arr[] = new String[]{"Problem3", "Java Core", "Homework5", "homework5", "test1"};
		String str = "Java";
		
		String result = "Not Found";
		
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].equals(str)) {
					result = arr[i];
				} 
			}
		System.out.println(result);
	}
}
