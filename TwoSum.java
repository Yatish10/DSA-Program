package Hashing;

import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	
	
	// TwoSum prob using HashMap
	public static int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < numbers.length; i++) {
			if(!map.containsKey(target - numbers[i])) {
			map.put(numbers[i], i);
		}
		else {
			result[1] = i;
			result[0] = map.get(target - numbers[i]);
			return result;
		}
	}
		throw new IllegalArgumentException("Two numbers not Found");
	}
	
	 // TwoSum Problem using Array
	
	public static int[] twoSumII(int[] arr, int target) {
        // Sorting and Two Pointer
        Arrays.sort(arr); // 0 2 6 7 10 11
        int left = 0;
        int right = arr.length - 1;
        int[] result = new int[2];
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                result[0] = arr[left];
                result[1] = arr[right];
                return result;
            } else if(sum < target){
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
	

	public static void main(String[] args) {
		int[] numbers = new int[] {11,2,0,10,7,6};
		int[] result = twoSumII(numbers, 9);
		System.out.println("The Two Indices are - " +result[0]+ " and " +result[1]);
		
		int[] result1 = twoSum(numbers, 9);
		System.out.println("The Two Indices are - " +result1[0]+ " and " +result1[1]);
	}

}
