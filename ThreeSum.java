package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
	public static void main(String args[]) {
		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
		int[] num = {0,0,0,0};
		output = threeSum(num);
		System.out.println(output);
	}
	
	public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // small pass
        // large not pass
		
		// sort array num first
		Arrays.sort(num);

		ArrayList<ArrayList<Integer>> sols = new ArrayList<ArrayList<Integer>>();
        int len = num.length;
        
        for (int i = 0; i < len - 2; i++) {
        	int k = i + 1;
        	int l = len - 1;
        	while (k<l) {
        		if (num[i]+num[k]+num[l] == 0) {
        			ArrayList<Integer> sol = new ArrayList<Integer>();
        			sol.add(num[i]);
        			sol.add(num[k]);
        			sol.add(num[l]);
        			if (!sols.contains(sol)) {
        				sols.add(sol);
        			}
        			k++;
        			l--;
        			continue;
        		}
        		if (num[i]+num[k]+num[l] > 0) {
        			l--;
        			continue;
        		}
        		if (num[i]+num[k]+num[l] < 0) {
        			k++;
        			continue;
        		}
        	}
        }
        
        return sols;
    }
}
