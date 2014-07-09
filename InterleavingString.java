package leetcode;

public class InterleavingString {
	
	public static void main(String args[]) {
		System.out.println(isInterleave("abbbbbbcabbacaacccababaabcccabcacbcaabbbacccaaaaaababbbacbb", "ccaacabbacaccacababbbbabbcacccacccccaabaababacbbacabbbbabc", "cacbabbacbbbabcbaacbbaccacaacaacccabababbbababcccbabcabbaccabcccacccaabbcbcaccccaaaaabaaaaababbbbacbbabacbbacabbbbabc"));
	}
	
	public static boolean isInterleave(String s1, String s2, String s3) {
        // Start typing your Java solution below
        // DO NOT write main() function
		if (s1.equals(""))
            if (s2.equals(s3))
                return true;
            else 
                return false;
        if (s2.equals(""))
            if (s1.equals(s3))
                return true;
            else 
                return false;
        boolean tf = false;
        if (s1.charAt(0) == s3.charAt(0))
            tf = isInterleave(s1.substring(1), s2, s3.substring(1));
        if (tf)
        	return tf;
        if (s2.charAt(0) == s3.charAt(0))
            tf = isInterleave(s1, s2.substring(1), s3.substring(1));
        return tf;
    }
}
