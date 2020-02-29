/*
 * Solve problem 7 without using another array, but reversing elements in the same array
 */
public class Problem8 {
	public static void main(String[] args) {

		int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
		int x = 0;
		int l = arr.length-1;
		
		for (int i = l, j = 0; i > -1; i--, j++) {	
			System.out.println(i + " - before: " + arr[i]);
			
			if (j < i) {
				x = arr[i];
				arr[i] = arr[j];
				arr[j] = x;
			} else if (i == j) {
				arr[i] = arr[j];
			}
				
			System.out.println(i + " - after: " + arr[i]);
			//System.out.println("j " + arr[j]);
			//System.out.println();
		}
	}
}
