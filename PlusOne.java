package leetcode;

public class PlusOne {	
	public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len = digits.length;
        int[] temp = new int[len];
        int carry = 1;
        for (int i = len-1; i >= 0; i--) {
            temp[i] = digits[i] + carry;
            if (temp[i] >= 10) {
                temp[i] -= 10;
                carry = 1;
            } else {
                carry = 0;
            }
        }
        if (carry == 1) {
            int[] result = new int[len+1];
            result[0] = 1;
            for (int j = 0; j < len; j++) {
                result[j+1] = temp[j];
            }
            return result;
        } else {
            return temp;
        }
    }
}
