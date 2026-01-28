class Solution {
    ArrayList<Integer> twoOddNum(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> m = new HashMap<>();

        // Count frequencies
        for (int num : arr) {
            m.put(num, m.getOrDefault(num, 0) + 1);
        }

        // Find odd occurring numbers
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                ans.add(entry.getKey());
            }
        }

        // Sort in descending order
        Collections.sort(ans, Collections.reverseOrder());
        return ans;
    }
}
