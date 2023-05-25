package Array;

public class MoveZerosToEnd {
	public static void moveZeros(int[] arr, int n) {
		int j=0;                  // j will focus on zeros elements
		for(int i=0; i<n; i++) {  // i will focus on non zeros elements
			if(arr[i]!=0 && arr[j]==0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if(arr[j]!=0) {
				j++;
			}
		}
	}
	public static void printArray(int arr[]) {
		for (int i=0; i<arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		int[] arr = {1, 4, 0, 8, 0, 0, 12, 0};
		printArray(arr);
		moveZeros(arr, arr.length);
		printArray(arr);
		
	}

}
