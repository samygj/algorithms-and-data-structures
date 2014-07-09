package leetcode;

public class ScrambleString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcdefghijklmnopq";
		String b = "efghijklmnopqcadb";
		System.out.println(isScramble(a,b));
	}

	
	public static boolean initCheck = false;
    public static boolean isScramble(String s1, String s2) {
        if (s1.length() == 0) return true;
        if (s1.length() == 1) 
            if (s1.equals(s2))
                return true;
            else
                return false;
        if (!initCheck) {
            int[] count = new int[256];
            for (int a = 0; a < s1.length(); a++)
                count[s1.charAt(a)]++;
            for (int b = 0; b < s2.length(); b++) {
                count[s2.charAt(b)]--;
                if (count[s2.charAt(b)] < 0)
                    return false;
            }
            initCheck = true;
        }
        for (int i = 1; i < s1.length(); i++) {
            if ((isScramble(s1.substring(0,i),s2.substring(0,i)) 
                    && isScramble(s1.substring(i),s2.substring(i)))
                || (isScramble(s1.substring(0,i),s2.substring(s1.length()-1-i)) 
                    && isScramble(s1.substring(s1.length()-1-i),s2.substring(i))))
                return true;
        }
        return false;
    }
}
