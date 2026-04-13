import java.util.*;

class Solution {
    public int maxMeetings(int start[], int end[]) {
        
        List<int[]> meetings = new ArrayList<>();
        
        for (int i = 0; i < start.length; i++) {
            meetings.add(new int[]{end[i], start[i], i + 1});
        }

        // Sort by end time
        meetings.sort(Comparator.comparingInt(a -> a[0]));

        int count = 0;
        int lastEnd = -1;

        for (int[] m : meetings) {
            // If meeting can be scheduled
            if (m[1] > lastEnd) {
                count++;
                lastEnd = m[0];
            }
        }

        return count;
    }
}
