package leetcode;

import java.util.ArrayList;

public class PermutationSequence {
//	we can use NextPermutation function
	public static void main(String[] args) {
		System.out.println(getPermutation(4,4));
	}
	
	public static String getPermutation(int n, int k) {
        String x = "";
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 1; i <= 9; i++) {
            al.add(i);
        }
        while (n > 0) {
            int d = k / factorial(n-1);
            x += String.valueOf(al.get(d));
            al.remove(d);
            n = k % factorial(n-1);
        }
        return x;
    }
    
    public static int factorial(int a) {
        int x = 1;
        while (a > 0) {
            x *= a;
            a--;
        }
        return x;
    }
}
