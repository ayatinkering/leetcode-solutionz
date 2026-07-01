class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Deque<Integer> stk = new ArrayDeque<>();

        for (int i=0;i<2*n;i++) { //traverse twice for CIRCULAR ARRAY
            int curr = nums[i%n];
            if (stk.isEmpty() || curr <= nums[stk.peek()]) {
                if (i<n) stk.push(i); //only push original indices, no need to find ans for duplicated indexes
            } else {
                while (!stk.isEmpty() && curr>nums[stk.peek()]) {
                    ans[stk.pop()] = curr;
                }
                if (i<n) stk.push(i); // only push original indices
            }
        }
        return ans;
    }
}