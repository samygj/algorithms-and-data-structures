package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CombinationSumII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1};
		System.out.print(combinationSum2(num, 1));
	}

    public static ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
    public static HashMap<ArrayList<Integer>, Integer> hm = new HashMap<ArrayList<Integer>, Integer>();

	public static ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        if (target == 0) return x;
        Arrays.sort(num);
        ArrayList<Integer> p = new ArrayList<Integer>();
        doCombine(num, target, p);
        return x;
    }
    
    public static void doCombine(int[] num, int target, ArrayList<Integer> p) {
        if (target == 0 && p.size() != 0) {
            if (!hm.containsKey(p)) {
            	ArrayList<Integer> temp = new ArrayList<Integer>(p);
                x.add(temp);
                hm.put(temp,1);
            }
            return;
        }
        int len = num.length;
        if (len == 0) return;
        
        if (target < num[0]) return;
        int[] sub = new int[len-1];
        for (int i = 1; i < len; i++) {
            sub[i-1] = num[i];
        }
        doCombine(sub, target, p);
        p.add(num[0]);
        doCombine(sub, target-num[0], p);
        p.remove(p.size()-1);
    }
}
