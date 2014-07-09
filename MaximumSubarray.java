package leetcode;

import java.util.Arrays;

public class MaximumSubarray {
	
	public static void main(String[] args) {
		int[] input = {1};
		int output = maxSubArray(input);
		System.out.println(output);
	}
	
	public static int maxSubArray(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
		int[] B = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			B[i] = A[i];
		}
        Arrays.sort(B);
        boolean tf = false;
        for (int i : B) {
            if (i > 0)
                tf = true;
        }
        if (!tf) {
            return B[B.length - 1];
        }
        int max = 0;
        int temp = 0;
        for (int a : A) {
            temp += a;
            if (temp < 0) 
                temp = 0;
            else if (temp > max)
                max = temp;
        }
        return max;
    }
}
