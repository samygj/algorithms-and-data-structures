package leetcode;

import java.util.ArrayList;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class InsertInterval {
	
	public class Interval {
		int start;
		int end;
		Interval() { start = 0; end = 0; }
		Interval(int s, int e) { start = s; end = e; }
	}
	
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Interval> result = new ArrayList<Interval>();
        if (intervals.size() == 0) {
            result.add(newInterval);
            return result;
        }
        boolean oStart = false;
        boolean oEnd = false;
        int mergeStart = newInterval.start;
        int mergeEnd = newInterval.end;
        Interval merge = new Interval(mergeStart, mergeEnd);
        for (Interval i : intervals) {
            int start = i.start;
            int end = i.end;
            if (merge.start <= end && !oStart) {
                oStart = true;
                merge.start = Math.min(start, merge.start);
            }
            if (merge.end < start && oStart && !oEnd) {
                oEnd = true;
                result.add(merge);
            }
            if (merge.end >= start && oStart && !oEnd) {
                merge.end = Math.max(end, merge.end);
                continue;
            }
            if (!oStart || oEnd)
                result.add(i);
        }
        if (!oEnd) 
            result.add(merge);
        return result;
    }
}