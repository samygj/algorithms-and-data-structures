package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Combinations {
    private int n, k;
    ArrayList<ArrayList<Integer>> result;
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
        this.n = n;
        this.k = k;
        result = new ArrayList<ArrayList<Integer>>();
        boolean[] used = new boolean[n];
        Arrays.fill(used, false);
        calc(used, 0, 0);
        return result;
    }
    
    public void calc(boolean[] used, int start, int depth) {
        if (depth < k) {
            for (int i = start; i < n; i++) {
                used[i] = true;
                calc(used, i+1, depth+1);
                used[i] = false;
            }
        }  else {
            ArrayList<Integer> comb = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                if (used[i]) {
                    comb.add(i+1);
                }
            }
            result.add(comb);
        }
    }
}