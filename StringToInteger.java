package leetcode;

import java.util.Stack;

public class StringToInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(atoi("    10522545459"));
	}

	public static int atoi(String str) {
        if (str.length() == 0) return 0;
        boolean neg = false;
        Stack<Integer> s = new Stack<Integer>();
        while (str.charAt(0) == ' ')
            str = str.substring(1);
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            neg = true;
        } else if (str.charAt(0) == '+') {
            str = str.substring(1);
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                s.push(c-'0');
            } else {
                break;
            }
        }
        int digit = 1;
        long x = 0;
        while (!s.isEmpty()) {
            x += s.pop() * digit;
            digit *= 10;
            if (x > Integer.MAX_VALUE) {
                if (neg)
                    x = Integer.MIN_VALUE;   
                else {
                    x = Integer.MAX_VALUE;
                }
                return (int)x;
            }
        }
        if (neg)
            x = -x;
        return (int)x;
    }
}
