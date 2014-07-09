package leetcode;

public class ThreeSumClosest {
	
	public static void main(String args[]) {
		int[] num = {0, 1, 2};
		int output = threeSumClosest(num, 0);
		System.out.println(output);
	}
	
	public static int threeSumClosest(int[] num, int target) {
        // small pass
		// large pass
		int closest = num[0] + num[1] + num[2];
        for (int i = 0; i < num.length - 2; i++) {
            for (int j = i + 1; j < num.length - 1; j++) {
                for (int k = j + 1; k < num.length; k++) {
                    int temp = num[i] + num[j] + num[k];
                    if (Math.abs(temp - target) < Math.abs(closest - target)) {
                        closest = temp;
                    }
                }
            }
        }
        return closest;
    }
}