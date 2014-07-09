package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class NextPermutation {
	public void nextPermutation(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len = num.length;
        if (len == 0 || len == 1) {}
        else {
            ArrayList<Integer> rearrange = new ArrayList<Integer>();
            int current = num[len-1];
            rearrange.add(current);
            int i = len - 2;
            boolean desc = true;
            while (i >= 0) {
                if (num[i] >= current) {
                    rearrange.add(num[i]);
                    current = num[i];
                    i--;
                } else {
                    int temp = num[i];
                    for (int j = 0; j < rearrange.size(); j++) {
                        if (rearrange.get(j) > num[i]) {
                            num[i] = rearrange.get(j);
                            rearrange.set(j, temp);
                            break;
                        }
                    }
                    for (int j = i+1; j < len; j++) {
                        num[j] = rearrange.get(j-i-1);
                    }
                    desc = false;
                    break;
                }
            }
            if (desc) {
                Arrays.sort(num);
            }
        }
    }
}
