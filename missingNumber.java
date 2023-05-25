package Array;

public class missingNumber {
	public static int findMissingNumber(int[] arr) {
		int n = arr.length + 1;
		int sum = n * (n+1) / 2;
		for (int num : arr) {
			sum = sum - num;
		}
		return sum;
	}
	public static void printArray(int arr[]) {
		for (int i=0; i<arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		int [] arr = {2,4,1,6,8,3,7};
		printArray(arr);
		System.out.println("The Missing Number from 1 to 8 is: " +findMissingNumber(arr));
	}

}
