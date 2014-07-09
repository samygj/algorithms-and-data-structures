package leetcode;

public class DistinctSubsequences {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = numDistinct("aabdbaabeeadcbbdedacbbeecbabebaeeecaeabaedadcbdbcdaabebdadbbaeabdadeaabbabbecebbebcaddaacccebeaeedababedeacdeaaaeeaecbe", "bddabdcae");
		int x = numDistinct("rabbbit", "rabbit");
		System.out.print(x);
	}
	
	public static int numDistinct(String S, String T) {
        if (S.length() < T.length()) return 0;
        if (T.length() == 0) return 1;
        int x = numDistinct(S.substring(1), T);
        if (S.charAt(0) == T.charAt(0)) {
            x += numDistinct(S.substring(1), T.substring(1));
        }
        return x;
    }

}
