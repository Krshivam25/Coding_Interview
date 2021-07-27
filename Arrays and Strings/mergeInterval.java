//Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals.
//return an array of the non-overlapping intervals that cover all the intervals in the input.
// Time complexity is O(NlogN) + O(N^2)
import java.util.*;
public class mergeInterval {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        if(intervals.length == 0 || intervals == null) {
            return res.toArray(new int[0][]);
        }
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int[] i : intervals) {
            if(i[0] <= end) {
                end = Math.max(end, i[1]);
            }
            else {
                res.add(new int[] {start,end});
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[]{start, end});
        return res.toArray(new int[0][]);
    }
}