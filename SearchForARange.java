package leetcode;

public class SearchForARange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2, 2};
		int t = 2;
		int[] X = searchRange(A,t);
		System.out.println(X[0]);
		System.out.println(X[1]);
	}

	public static int[] searchRange(int[] A, int target) {
        return doSearch(A, target, 0, A.length-1);
    }
    
    public static int[] doSearch(int[] A, int t, int start, int end) {
        int[] x = new int[2];
        if (start == end)
            if (A[start] == t) {
                x[0] = start;
                x[1] = start;
                return x;
            } else {
                x[0] = -1;
                x[1] = -1;
                return x;
            }
        int mid = start + (end - start) /2;
        if (A[mid] == t) {
            int[] l = doSearch(A, t, start, mid);
            int[] r = doSearch(A, t, mid+1, end);
            x[0] = l[0];
            if (r[1] == -1)
                x[1] = mid;
            else
                x[1] = r[1];
            return x;
        } else if (t < A[mid]) {
            return doSearch(A, t, start, mid);
        } else if (t > A[mid]) {
            return doSearch(A, t, mid+1, end);
        }
        return x;
    }
}
