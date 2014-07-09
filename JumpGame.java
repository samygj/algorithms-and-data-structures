package leetcode;

public class JumpGame {
    public boolean canJump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int index = 0;
        int maxIndex = 0;
        while (index < A.length) {
        	boolean change = false;
            for (int i = index; i <= Math.min(A.length - 1, index + A[index]); i++) {
                if (i + A[i] > maxIndex + A[maxIndex]) {
                    maxIndex = i;
                    change = true;
                }
            }
            if (maxIndex == A.length - 1 || maxIndex + A[maxIndex] >= A.length - 1)
            	return true;
            else if (change)
                index = maxIndex;
            else 
            	return false;
        }
        return false;
    }
}