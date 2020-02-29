/*
 * Given an array of integers, find maximum and minimum elements in array.
 */
public class Problem6 {
	public static void main(String[] args) {
		int arr[] = new int[]{3, 1, 2, 5, 4, -6, 0, 101, 109};
		
		int max = 0;
		int min = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];				
			}
		}
		
		System.out.println(min);
		System.out.println(max);
	}
}
