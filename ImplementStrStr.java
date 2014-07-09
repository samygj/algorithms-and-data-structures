package leetcode;

public class ImplementStrStr {
	
	public static void main(String args[]) {
		String output = strStr("mississippi", "a");
		System.out.println(output);
	}
	
	public static String strStr(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (haystack == "")
            return null;
        if (needle == "")
            return haystack;
        if (needle.length() > haystack.length())
            return null;
        int index = haystack.indexOf(needle);
        if (index < 0)
        	return null;
        else 
        	return haystack.substring(index);
    }
}
