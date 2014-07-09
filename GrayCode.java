package leetcode;

import java.util.ArrayList;

public class GrayCode {
	public static void main(String[] args) {
		ArrayList<Integer> output = grayCode(2);
		System.out.println(output);
	}
	
	public static ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> x = new ArrayList<Integer>();
        if (n == 0) return x;
        if (n == 1) {    
            x.add(0);
            x.add(1);
            return x;
        }
        ArrayList<Integer> p = grayCode(n-1);
        ArrayList<Integer> r = reverseArrayList(p);
        for (int i = 0; i < p.size(); i++) {
            p.add(((int)Math.pow(2,n-1))+r.get(i));
        }
        return p;
    }
    
    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> al) {
        ArrayList<Integer> r = new ArrayList<Integer>();
        for (int i = al.size() - 1; i >= 0; i--) {
            r.add(al.get(i));
        }
        return r;
    }
}
