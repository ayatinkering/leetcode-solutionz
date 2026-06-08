class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> listans = new HashSet<>();
        Arrays.sort(nums);

        for(int a = 0; a < nums.length; a++) {
            long sum3 = (long)target - nums[a];
            for(int i = a + 1; i < nums.length; i++) {
                int l = i + 1;
                int r = nums.length - 1;
                long sum2 = sum3 - nums[i];

                while(l < r) {
                    long pairSum = (long)nums[l] + nums[r];
                    if(pairSum > sum2) {r--; }
                    else if(pairSum < sum2) {l++; }
                    else {
                        ArrayList<Integer> ans = new ArrayList<>();
                        ans.add(nums[a]);
                        ans.add(nums[i]);
                        ans.add(nums[l]);
                        ans.add(nums[r]);
                        listans.add(ans);
                        l++; r--;
                    }
                }
            }
        }

        return new ArrayList<>(listans);
    }
}