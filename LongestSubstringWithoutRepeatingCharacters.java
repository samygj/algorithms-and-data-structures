package leetcode;

public class LongestSubstringWithoutRepeatingCharacters {
	
	public static void main(String[] args) {
		int output = lengthOfLongestSubstring("abcabcde");
		System.out.println(output);
	}
	
	public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        String temp = "";
        int index = 0;
        int tempIndex = 0;
        while (index < s.length()) {
            if (temp.indexOf(s.substring(index,index+1)) >= 0) {
                if (temp.length() > maxLength) {
                    maxLength = temp.length();
                }
                tempIndex = temp.indexOf(s.substring(index,index+1)) + tempIndex + 1;
                temp = s.substring(tempIndex,tempIndex+1);
                index = tempIndex + 1;
            } else {
                temp += s.substring(index,index+1);
                index++;
            }
        }   
        if (temp.length() > maxLength) {
            maxLength = temp.length();
            temp = "";
        }
        return maxLength;
    }
}
