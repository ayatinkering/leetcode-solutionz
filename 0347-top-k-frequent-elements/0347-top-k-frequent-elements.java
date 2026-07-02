class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> minh = new PriorityQueue<>((a, b)->a[1]-b[1]);
        int[] ans = new int[k];

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int key : map.keySet()) {
            minh.offer(new int[]{key, map.get(key)});
            if (minh.size()>k)
                minh.poll(); //poll smaller freq elements, keep only K MOST FREW
        }

        for (int i = k-1; i >= 0; i--) {
            ans[i] = minh.poll()[0];
        }

        return ans;
    }
}