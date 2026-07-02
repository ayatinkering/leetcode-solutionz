class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxh = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            maxh.offer(i);
        }
        if(maxh.size()==1) return maxh.peek();

        while(maxh.size()>1){
            int y=maxh.poll();
            int x=maxh.poll();
            if(x!=y)
                maxh.offer(y-x);  
        }
        if(maxh.isEmpty()) return 0;
        return maxh.peek();
    }
}