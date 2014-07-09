package leetcode;

public class LenthOfLastWord {
	public int lengthOfLastWord(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String[] word = s.split(" ");
        int len = word.length;
        if (len == 0)
            return 0;
        int output = word[len-1].length();
        return output;
    }
}
