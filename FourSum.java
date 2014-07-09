package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {
	public static void main(String args[]) {
		int[] input = {1, 0, -1, 0, -2, 2};
		ArrayList<ArrayList<Integer>> output = fourSum(input, 0);
		System.out.println(output);
	}
	
	public static ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        // sort num first
		Arrays.sort(num);
        
        ArrayList<ArrayList<Integer>> sols = new ArrayList<ArrayList<Integer>>();
        int len = num.length;
        for (int i = 0; i < len - 3; i++) {
            for (int j = i + 1; j < len - 2; j++) {
                int k = j + 1;
                int l = len - 1;
                while (k<l) {
                	if (num[i]+num[j]+num[k]+num[l] == target) {
                		ArrayList<Integer> sol = new ArrayList<Integer>();
                		sol.add(num[i]);
                		sol.add(num[j]);
                		sol.add(num[k]);
                		sol.add(num[l]);
                		if (!sols.contains(sol)) {
                			sols.add(sol);
                		}
                		k++;
                		l--;
                	}
                	if (num[i]+num[j]+num[k]+num[l] > target) {
                		l--;                	
                	}
                	if (num[i]+num[j]+num[k]+num[l] < target) {
                		k++;
                	}
                }
            }
        }
        
        return sols;
    }
}
