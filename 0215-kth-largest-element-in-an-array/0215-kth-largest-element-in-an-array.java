class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minh=new PriorityQueue<>();
        for(int i:nums){
            minh.offer(i); //ADD elements till size k
            if(minh.size()>k) minh.poll(); //keep removing smallest eles
        }
        return minh.peek(); //returns kth largest ele
    }
}