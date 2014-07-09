package leetcode;

import java.util.ArrayList;

public class CombinationSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = {1,2};
		ArrayList<ArrayList<Integer>> x = combinationSum(candidates, 2);
	}

	public static ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
        int len = candidates.length;
        if (target == 0) return x;
        if (len == 1)
            if (target % candidates[0] == 0) {
                ArrayList<Integer> c = new ArrayList<Integer>();
                for (int i = 0; i < target/candidates[0]; i++)
                    c.add(candidates[0]);
                x.add(c);
                return x;
            } else
                return x;
        int[] prevCandidates = new int[len-1];
        for (int i = 0; i < len-1; i++)
            prevCandidates[i] = candidates[i];
        for (int i = 0; i <= (target / candidates[len-1]); i++) {
            if (target - i*candidates[len-1] == 0) {
                ArrayList<Integer> p = new ArrayList<Integer>();
                for (int j = 0; j < i; i++)
                    p.add(candidates[len-1]);
                x.add(p);
            } else {
                ArrayList<ArrayList<Integer>> prev = combinationSum(prevCandidates, target - i*candidates[len-1]);
                for (ArrayList<Integer> p : prev) {
                    for (int j = 0; j < i; j++)
                        p.add(candidates[len-1]);
                    x.add(p);
                }
            }
        }
        return x;
    }
}
