package leetcode;

public class DecodeWays {

	private int n = 0;
	
	public static void main(String args[]) {
		int output = numDecodings("20");
		System.out.println(output);
	}
	
	public static int numDecodings(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int result = 0;
        if (s.length() == 0)
            result = 0;
        else if (s.length() == 1)
            if (s.charAt(0) != '0') 
                result = 1;
            else 
                result = 0;
        else if (s.length() == 2) 
            if (s.charAt(0) == '0')
                result = 0;
            else if (s.charAt(0) == '1')
                if (s.charAt(1) != '0')
                    result = 2;
                else 
                    result = 1;
            else if (s.charAt(0) == '2')
                if (s.charAt(1) != '7' && s.charAt(1) != '8' 
                    && s.charAt(1) != '9' && s.charAt(1) != '0')
                    result = 2;
                else 
                    result = 1;
            else if (s.charAt(1) == '0')
                result = 0;
                else 
                    result = 1;
        else 
            result = numDecodings(s.substring(1)) * numDecodings(s.substring(0,1))
                + numDecodings(s.substring(2)) * check(s.substring(0,2));
        return result;
    }
    
    public static int check(String s) {
        int a = Integer.parseInt(s);
        if ( (a>=10) && (a<=26) )
            return 1;
        else 
            return 0;
    }
}
