package src.StriverSDE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OverLappingSubArray {
    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        merge(intervals);
    }
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][];
        }

        // Sort intervals by the starting time
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });

        List<int[]> merged = new ArrayList<>();

        // Iterate through the sorted intervals
        for (int i = 0; i < intervals.length; i++) {
            // If the list of merged intervals is empty or if the current interval does not overlap with the previous
            if (merged.isEmpty() || intervals[i][0] > merged.get(merged.size() - 1)[1]) {
                merged.add(intervals[i]);
            } else {
                // There is an overlap, so merge the current and previous intervals
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], intervals[i][1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
