package Array;

public class min_No_Array {
	public int findMinimum(int[] arr) {
		int min = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static void printArray(int arr[]) {
		for (int i=0; i<arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int [] arr = {5, 9, 3, 11, 15, 1};
		printArray(arr);
		min_No_Array ma = new min_No_Array();
		System.out.println(ma.findMinimum(arr));
	}
}
