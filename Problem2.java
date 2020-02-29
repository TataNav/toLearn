import java.util.Scanner;
public class Problem2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input size of array: ");
		int n = scanner.nextInt();
		
		int arr[] = new int[n];
		
		for (int i =0; i < arr.length; i++) {
			System.out.println();
			arr[i] = scanner.nextInt();
			System.out.print("Input element " + i + " : " + arr[i]);
			
		}
		
	}
}
