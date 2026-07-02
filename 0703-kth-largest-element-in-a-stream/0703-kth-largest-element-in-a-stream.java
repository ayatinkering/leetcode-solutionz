class KthLargest {

    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>();
        for (int i : nums) { //add from ARRAY, the k largest elements
            minHeap.offer(i); 
            if (minHeap.size() > k) 
                minHeap.poll();
            
        }
    }

    public int add(int val) { //add indivual value
        minHeap.offer(val);
        if (minHeap.size() > k) 
            minHeap.poll();
        
        return minHeap.peek(); //returns SMALLEST ELE - kth largest in heap size k
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */