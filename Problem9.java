/*
 * Given an a, find an element in the first array that doesn't occur in the  second array.
 */

public class Problem9 {
	public static void main(String[] args) {
		int arr1[] = new int[] {1, 2, 109, 3, 45};
		int arr2[] = new int[] {0, 1, 2, 3, 4};
		
		for (int i = 0; i < arr1.length; i++) {
			int count = 0;
			
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					count = arr1[i];
					break;
				}
			}
			if(count == 0) {
				System.out.println(arr1[i]);
			}
		}
	}
}