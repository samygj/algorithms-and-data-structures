package leetcode;

public class JumpGameII {
	
	public static void main(String args[]) {
		int[] input = {2,1};
		int output = jump(input);
		System.out.println(output);
	}
	
    public static int jump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	int step = 0;
        int index = 0;
        int maxIndex = 0;
        if (A.length == 1) 
            return 0;
        while (index < A.length) {
            boolean change = false;
            for (int i = index; i <= Math.min(A.length - 1, index + A[index]); i++) {
                if (index + A[index] >= A.length - 1)
                    return ++step;
                else if (i + A[i] > maxIndex + A[maxIndex]) {
                    maxIndex = i;
                    change = true;
                }
            }
            if (change)
            	step++;
            if (maxIndex == A.length - 1)
            	return step;
            else if (maxIndex + A[maxIndex] >= A.length - 1) 
                return ++step;
            else
                index = maxIndex;
        }
        return 0;
    }
}