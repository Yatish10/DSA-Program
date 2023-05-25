package Array;

public class resizeArray {
	
	public void printArray(int[] arr) {
	int n = arr.length;
	for(int i = 0; i<n; i++){
		System.out.print(arr[i]+ " ");
	}
	System.out.println();
 }
	
	public int[] resize(int[] arr, int capacity) {
		int[] temp = new int[capacity];
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
		return arr;
	}
	public static void main(String[] args) {
		resizeArray resizearr = new resizeArray();
		resizearr.printArray(new int [] {5, 10, 15, 20, 25});
		int [] original = new int [] {5, 10, 15, 20, 25};
		System.out.println("the size of original array : "+ original.length);
		original = resizearr.resize(original,  10);
		System.out.println("the size of original array after resize : "+ original.length);

	}
}

