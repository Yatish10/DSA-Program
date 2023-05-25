package String;


import java.util.Arrays;

import Array.min_No_Array;

public class ThreeSum {
	
	public static void threeSum(int[] arr, int target) {
		Arrays.sort(arr);
		for(int i = 0; i < arr.length - 2; i++) {
			int j = i + 1;
			int k = arr.length - 1;
			while(j < k) {
				int sum = arr[i] + arr[j] + arr[k];
				if(sum == target) {
					System.out.print(arr[i]+","+arr[j]+","+arr[k]);
					j++;
					k--;
				}
				else if (sum < target) {
					j++;
				}
				else {
					k--;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr = new int[] {4,7,2,1,3,0};
		ThreeSum ts = new ThreeSum();
		ts.threeSum(arr,4);

	}

}
