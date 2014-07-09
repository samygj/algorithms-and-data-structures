package leetcode;

public class ClimbingStairs {
	public int climbStairs(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (n == 3)
            return 3;
        if (n > 3) {
            return climbStairs(n-1) + climbStairs(n-2);
        }
        return 0;
    }
}
