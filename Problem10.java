/*
 *  Given array of integers and one integer k, find an element that occurs exactly k times
 */

public class Problem10 {
	public static void main(String[] args) {
		int arr[] = new int[] {1, 4, 3, 4, 5, 4, 8};
		int k = 3;
		
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for(int j = i + 1; j < arr.length - 1; j++) {
				if(arr[i] == arr[j]) {
					count += 1;
				}
			}
			if(count == k) {
				System.out.println(arr[i]);
			}
		}
		
	}
}
