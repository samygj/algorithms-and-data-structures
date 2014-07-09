package leetcode;

public class MinimumWindowSubstrgin {
	public static void main(String[] args) {
		System.out.println(minWindow("ADOBECODEBANC", "ABC"));
	}
	
	public static String minWindow(String S, String T) {
        int[] hasFound = new int[256];
        int[] needToFind = new int[256];
        int start = 0;
        int end = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        String x = "";
        
        for (int i = 0; i < T.length(); i++)
            needToFind[T.charAt(i)]++;
            
        for (; end < S.length(); end++) {
            if (needToFind[S.charAt(end)] == 0) continue;
            
            char c = S.charAt(end);
            hasFound[c]++;
            if (hasFound[c] <= needToFind[c])
                count++;
            
            if (count == T.length()) {
                while (needToFind[S.charAt(start)] == 0 || hasFound[S.charAt(start)] > needToFind[S.charAt(start)]) {
                    if (hasFound[S.charAt(start)] > needToFind[S.charAt(start)])
                        hasFound[S.charAt(start)]--;
                    start++;
                }
                
                if (end - start + 1 < min) {
                    min = end - start + 1;
                    x = S.substring(start, end + 1);
                }
            }
        }
        return x;
    }
}
