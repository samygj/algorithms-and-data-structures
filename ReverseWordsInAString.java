package leetcode;

public class ReverseWordsInAString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("hello world!"));
	}

	public static String reverseWords(String s) {
        String x = "";
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (!temp.equals("")) {
                    if (x.equals(""))
                        x = temp;
                    else {
                        x = temp + " " + x;
                        temp = "";
                    }
                }
            } else {
                temp += c;
            }
        }
        return x;
    }
}
