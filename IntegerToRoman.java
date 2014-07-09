package leetcode;

public class IntegerToRoman {
    public String intToRoman(int num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String[] RCODE = {"M", "CM", "D", "CD", "C", "XC", "L",
                                           "XL", "X", "IX", "V", "IV", "I"};
        int[]    BVAL  = {1000, 900, 500, 400,  100,   90,  50,
                                           40,   10,    9,   5,   4,    1};
        String roman = "";         // Roman notation will be accumualated here.
        
        // Loop from biggest value to smallest, successively subtracting,
        // from the binary value while adding to the roman representation.
        for (int i = 0; i < RCODE.length; i++) {
            while (num >= BVAL[i]) {
                num -= BVAL[i];
                roman  += RCODE[i];
            }
        }
        return roman;
    }
}