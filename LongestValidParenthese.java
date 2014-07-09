package leetcode;

public class LongestValidParenthese {
	
	public static void main(String[] args) {
		int output = longestValidParentheses("()()");
		System.out.println(output);
	}
	
	public static int longestValidParentheses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int max = 0;
        int left = 0;
        int right = 0;
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i,i+1).equals("("))
            	left++;
            else 
            	right++;
            if (right > left) {
            	temp = 0;
            	left = 0;
            	right = 0;
            	continue;
            } else {
            	temp++;
            	if (temp > max && left == right) {
            		max = temp;
            	}
            }
        }
        temp = 0;
        left = 0;
        right = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.substring(i,i+1).equals(")"))
            	right++;
            else 
            	left++;
            if (left > right) {
            	temp = 0;
            	left = 0;
            	right = 0;
            	continue;
            } else {
            	temp++;
            	if (temp > max && left == right) {
            		max = temp;
            	}
            }
        }
        return max;
    }
}
