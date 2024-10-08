package LeetCode-problems;

import java.util.Arrays;

public class roatearrayktimes {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int k = 3;
		System.out.println(Arrays.toString(rotatearr(nums, k)));
	}

	public static int[] rotatearr(int[] nums, int k) {
		int n = nums.length;
		reverse(nums, 0, n - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, n - 1);
		return nums;

	}

	public static void reverse(int[] nums, int start, int end) {

		while (start < end) {
			int tem = nums[start];
			nums[start] = nums[end];
			nums[end] = tem;
			start++;
			end--;
		}

	}

}
