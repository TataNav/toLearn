/*
 * Given an array of integers, create another array that have elements of the first array in reversed order
 */
public class Problem7 {
	public static void main(String[] args) {

		int arr1[] = new int[]{3, 1, 2, 5, 4, -6, 0, 101, 109};
		int arr2[] = new int[arr1.length];
		int j = 0;
		
		for (int i = arr1.length-1; i > -1; i--) {	
			arr2[j] = arr1[i];
			System.out.print(arr2[j] + " ");
			j++;
		}
		
	}
}
