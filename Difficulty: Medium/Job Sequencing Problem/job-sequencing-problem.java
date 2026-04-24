import java.util.*;

class Solution {

    class Job {
        int deadline, profit;

        Job(int d, int p) {
            this.deadline = d;
            this.profit = p;
        }
    }

    // DSU find
    public int find(int x, int[] parent) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x], parent); // path compression
    }

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {

        int n = deadline.length;

        Job[] jobs = new Job[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(deadline[i], profit[i]);
        }

        // Sort by profit ↓
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Find max deadline
        int maxdead = 0;
        for (int d : deadline) {
            maxdead = Math.max(maxdead, d);
        }

        // DSU array
        int[] parent = new int[maxdead + 1];
        for (int i = 0; i <= maxdead; i++) {
            parent[i] = i;
        }

        int totalprofit = 0;
        int totaljobs = 0;

        for (int i = 0; i < n; i++) {
            int d = jobs[i].deadline;

            // find available slot
            int availableSlot = find(d, parent);

            if (availableSlot > 0) {
                totaljobs++;
                totalprofit += jobs[i].profit;

                // mark this slot as filled
                parent[availableSlot] = find(availableSlot - 1, parent);
            }
        }

        return new ArrayList<>(Arrays.asList(totaljobs, totalprofit));
    }
}