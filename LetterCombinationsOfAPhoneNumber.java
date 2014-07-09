package leetcode;

import java.util.ArrayList;

public class LetterCombinationsOfAPhoneNumber {
	private static ArrayList<String> result;
	
	public static void main(String args[]) {
		String input = "";
		System.out.println(letterCombinations(input));
	}
    
    public static ArrayList<String> letterCombinations(String digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        result = new ArrayList<String>();
        comb(digits, "");
        return result;
    }
    
    public static void comb(String d, String r) {
        if (d.length()==0)
            result.add(r);
        else {
        	String[] first = mapping(d.substring(0,1));
	        for (String a : first) {
	            String temp = r;
	            temp = temp + a;
	            comb(d.substring(1),temp);
	        }
        }
    }
    
    public static String[] mapping(String d) {
        if (d.equals("2")) {
            String[] a = {"a","b","c"};
            return a;
        }
        if (d.equals("3")) {
            String[] a = {"d","e","f"};
            return a;
        }
        if (d.equals("4")) {
            String[] a = {"g","h","i"};
            return a;
        }
        if (d.equals("5")) {
            String[] a = {"j","k","l"};
            return a;
        }
        if (d.equals("6")) {
            String[] a = {"m","n","o"};
            return a;
        }
        if (d.equals("7")) {
            String[] a = {"p","q","r","s"};
            return a;
        }
        if (d.equals("8")) {
            String[] a = {"t","u","v"};
            return a;
        }
        if (d.equals("9")) {
            String[] a = {"w","x","y","z"};
            return a;
        }
        return null;
    }
}
