package leetcode;

import java.util.ArrayList;

public class RestoreIPAddress {
	public static void main(String[] args) {
		ArrayList<String> a = restoreIpAddresses("0000");
		for (String b : a) {
			System.out.println(b);
		}
	}
	
	public static ArrayList<String> x = new ArrayList<String>();
    public static ArrayList<String> restoreIpAddresses(String s) {
        doRestore(s,"",0);
        return x;
    }
    
    public static void doRestore(String s, String t, int index) {
        if (index != 3) {
            if (s.length() < 4-index) return;
            if (index != 0)
                t += ".";
            if (Integer.parseInt(s.substring(0,3)) < 256) {
                doRestore(s.substring(3),t+s.substring(0,3),index+1);
            }
            doRestore(s.substring(2),t+s.substring(0,2),index+1);
            doRestore(s.substring(1),t+s.substring(0,1),index+1);
        }
        if (index == 3 && s.length() > 0 && s.length() < 4 && Integer.parseInt(s) < 256) {
            t += "." + s;
            x.add(t);
        }
    }
}
