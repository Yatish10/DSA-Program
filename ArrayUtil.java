package Sorting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayUtil {
	
	public void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	public static int[] sortedSquares(int [] arr) {
		int n = arr.length;
		int i = 0;
		int j = n-1;
		int [] result = new int[n];
		
		for(int k = n-1; k >= 0; k--) {
			if (Math.abs(arr[i]) > Math.abs(arr[j])){
				result[k] = arr[i] * arr[i];
				i++;
			}
			else {
				result[k] = arr[j] * arr[j];
				j--;
			}
		}
		return result;
	}
	
	
	
	public void arrayDemo() {
		int [] arr = {2, 3, 10, 5, 20, 6, 4, 9};
		printArray(arr);
		int[] result = sortedSquares(arr);
		printArray(result);
		
	    
		
	}



	public static void main(String[] args) {
		ArrayUtil ss = new ArrayUtil();
		ss.arrayDemo();
		
	}

}
