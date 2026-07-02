class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minh=new PriorityQueue<>();
        for(int i:nums){
            minh.offer(i);
            if(minh.size()>k) minh.poll();
        }
        return minh.peek();
    }
}