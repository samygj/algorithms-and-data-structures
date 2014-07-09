package leetcode;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (strs.length==0) 
            return "";
        String prefix = strs[0];
        for (String s : strs) {
            prefix = getPrefix(s, prefix);
        }
        return prefix;
    }
    
    public String getPrefix(String a, String b) {
        if (a.length()==0)
            return "";
        if (b.length()==0)
            return "";
        String p = "";
        if (a.substring(0,1).equals(b.substring(0,1)))
            p = a.substring(0,1) + getPrefix(a.substring(1), b.substring(1));
        return p;
    }
}
