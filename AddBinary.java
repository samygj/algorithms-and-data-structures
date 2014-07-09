package leetcode;

public class AddBinary {
	public static void main(String args[]) {
		String output = addBinary("101", "11");
		System.out.println(output);
	}
	
	public static String addBinary(String a, String b) {
        // Start typing your Java solution below
        // DO NOT write main() function
		
        // all pass
		int lenA = a.length();
        int lenB = b.length();
        int len;
        if (lenA >= lenB) {
            String gap = "";
            for (int i = 0; i < lenA - lenB; i++) {
                gap += "0";
            }
            b = gap + b;
            len = lenA;
        } else {
            String gap = "";
            for (int i = 0; i < lenB - lenA; i++) {
                gap += "0";
            }
            a = gap + a;
            len = lenB;
        }
        // start adding
        int carry = 0;
        int[] result = new int[len];
        for (int j = len - 1; j >= 0; j--) {
            int x = Integer.parseInt(Character.toString(a.charAt(j)));
            int y = Integer.parseInt(Character.toString(b.charAt(j)));
            if (x + y + carry == 0 || x + y + carry == 1) {
                result[j] = x + y + carry;
                carry = 0;
                continue;
            }
            if (x + y + carry == 2) {
                result[j] = 0;
                carry = 1;
                continue;
            }
            if (x + y + carry == 3) {
                result[j] = 1;
                carry = 1;
                continue;
            }
        }
        String output = "";
        if (carry == 1) {
            output = "1";
        } 
        for (int k = 0; k < len; k++) {
            output += Integer.toString(result[k]);
        }
        return output;
    }
}
