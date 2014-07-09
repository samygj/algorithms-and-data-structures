package leetcode;

public class CountAndSay {
	public static void main(String args[]) {
		String output = countAndSay(5);
		System.out.println(output);
	}
	
	public static String countAndSay(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (n == 1) 
            return "1";
        else {
            String output = "";
            String prev = countAndSay(n - 1);
            int len = prev.length();
            char prevChar = prev.charAt(0);
            int index = 0;
            int count = 0;
            while (index < len) {
                if (prev.charAt(index) == prevChar) {
                	count++;
                } else {
                    output += Integer.toString(count) + Character.toString(prevChar);
                    prevChar = prev.charAt(index);
                    count = 1;
                }
                if (index == len - 1) {
            		output += Integer.toString(count) + Character.toString(prevChar);
            	}
                index++;
            }
            return output;
        }
    }
}
