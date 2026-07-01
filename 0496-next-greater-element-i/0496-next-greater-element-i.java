class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans[] = new int[nums1.length];
        Deque<Integer> stk = new ArrayDeque<>();

        for(int i:nums2){
            if(stk.isEmpty() || i<=stk.peek()){
                stk.push(i);
            }else{
                while(!stk.isEmpty() && i>stk.peek()){
                    map.put(stk.pop(),i);
                    
                }
                stk.push(i);
            }
        }
        for(int i=0;i<nums1.length;i++){
            ans[i] = map.getOrDefault(nums1[i], -1);
        }
        return ans;
    }
}