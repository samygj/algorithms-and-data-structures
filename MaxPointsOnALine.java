package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MaxPointsOnALine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Point[] p = {new Point(84,250),new Point(0,0),new Point(1,0),new Point(0,-70),new Point(0,-70),new Point(1,-1),new Point(21,10),new Point(42,90),new Point(-42,-230)};
//		Point[] p = {new Point(2,3), new Point(3,3), new Point(-5,3)};
		Point[] p = {new Point(4,0), new Point(4,-1), new Point(4,5)};
		System.out.println(maxPoints(p));
	}

	
	public static int maxPoints(Point[] points) {
        if (points.length < 2) return points.length;
        int max = 2;
        for (int i = 0; i < points.length-1; i++) {
            Map<Double, Integer> m = new HashMap<Double, Integer>();
            int dup = 0;
            int y = 1;
            double f;
            for (int j = i+1; j < points.length; j++) {
                if (points[i].x == points[j].x && points[i].y == points[j].y)
                    dup++;
                else if (points[i].x == points[j].x)
                    y++;
                else {
                    f = 0.0 + (double) (points[j].y - points[i].y) / (double) (points[j].x - points[i].x);
                    if (m.containsKey(f))
                        m.put(f, m.get(f)+1);
                    else
                        m.put(f, 2);
                }
            }
            if (y > max)
                max = y;
            if (dup+1 > max)
                max = dup+1;
            for (int k : m.values())
                if (k+dup > max)
                    max = k+dup;
        }
        return max;
    }
}
