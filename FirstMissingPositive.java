package leetcode;

import java.util.Hashtable;

public class FirstMissingPositive {
	
	public int firstMissingPositive(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Hashtable<Integer, Boolean> ht = new Hashtable<Integer, Boolean>();
        for (int i : A) {
            if (i > 0)
                ht.put(i, true);
        }
        int key = 1;
        while (true) {
            if (!ht.containsKey(key))
                break;
            else 
                key++;
        }
        return key;
    }
}
