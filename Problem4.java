/*
 * Write a program that copies elements of one array into another array.
 */
public class Problem4 {
	public static void main(String[] args) {
		int n = 2;
		int arr1[] = new int[n];
		int arr2[] = arr1.clone();
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
