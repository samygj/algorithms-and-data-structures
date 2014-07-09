package leetcode;

import java.util.ArrayList;

public class GenerateParentheses {
    
    private static ArrayList<String> result;
    
    public static ArrayList<String> generateParenthesis(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        result = new ArrayList<String>();
        gen(n, "", 0, 0);
        return result;
    }
    
    /*private void gen(int n, int left, int right, String str) {
        if (right == n) 
            result.add(str);
        else {
            if (left < n)
                gen(n, left+1, right, str+"(");
            if (right < left)
                gen(n, left, right+1, str+")");
        }
    }*/
    public static void gen(int n, String str, int open, int close) {
        if (close == n) {
            result.add(str);
            return;
        }
        if (open > close) {
            str += ")";
            gen(n, str, open, close+1);
        }
        if (open < n) {
            str += "(";
            gen(n, str, open+1, close);
        }
    }
    
    public static void main(String[] args) {
    	ArrayList<String> x = generateParenthesis(2);
    	for (String a : x) {
    		System.out.println(a);
    	}
    }
}