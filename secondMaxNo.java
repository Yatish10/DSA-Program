package Array;

public class secondMaxNo {
	int findSecondMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > max) {
				secondMax = max;
				max = arr[i];
		
			}
		}
		return secondMax;
	}
	public static void printArray(int arr[]) {
		for (int i=0; i<arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int [] arr = {10, 19, 33, 33, 35, 11};
		printArray(arr);
		secondMaxNo secmax = new secondMaxNo();
		System.out.println(secmax.findSecondMax(arr));

	}

}
