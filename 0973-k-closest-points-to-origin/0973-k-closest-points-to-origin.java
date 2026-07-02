class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a,b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1])
        ); //how to compare the points COMPARATOR b dist-a dist

        for (int[] i : points) {
            maxHeap.offer(i);
            if (maxHeap.size() > k) 
                maxHeap.poll();
        }

        for (int i = 0; i < k; i++) {
            ans[i] = maxHeap.poll();
        }
        return ans;
    }
}