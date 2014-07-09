package leetcode;

public class SingleNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {-19,-46,-19,-46,-9,-9,-19,17,17,17,-13,-13,-9,-13,-46,-28};
		singleNumber(A);
	}
	
	public static int singleNumber(int[] A) {
        int x = 0;
        for (int i = 0; i < 32; i++) {
            int t = 0;
            for (int j = 0; j < A.length; j++) {
                t += A[j] & (1 << i);
            }
            t = t % (3 * (1 << i));
            x += t;
        }
        return x;
    }

}
