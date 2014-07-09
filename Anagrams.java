package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Anagrams {
	public static void main(String args[]) {
//		String[] input = {"tea","and","ate","eat","dan"};
		String[] input = {"c", "c"};
		ArrayList<String> output = anagrams(input);
		System.out.println(output);
	}
	
	public static ArrayList<String> anagrams(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> results = new ArrayList<String>();
        HashSet<Integer> set = new HashSet<Integer>();
        int len = strs.length;
        boolean[] flag = new boolean[len];
        for (int i = 0; i < len - 1; i++) {
            if (flag[i]) {
                continue;
            } else {
                for (int j = i+1; j < len; j++) {
                    if (flag[j]) 
                        continue;
                    else {
                        if (isAnagram(strs[i], strs[j])) {
                            set.add(i);
                            set.add(j);
                            flag[i] = true;
                            flag[j] = true;
                        }
                    }
                }
            }
        }
        for (Integer s : set) {
            results.add(strs[s]);
        }
        return results;
    }
    
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        } else {
        	String s = a + a;
        	if (s.indexOf(b) >= 0) {
        		return true;
        	}
        }
        return false;
    }
}
