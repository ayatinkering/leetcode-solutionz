class Solution {

    Integer[][] dp;

    public int splitArray(int[] nums, int k) {
        dp = new Integer[nums.length][k + 1];
        return helper(nums, 0, k);
    }

    public int helper(int[] nums, int start, int parts) {

        if (start == nums.length) { // all numbers used
            if (parts == 0)
                return 0;
            else
                return Integer.MAX_VALUE;
        }

        if (parts == 0) // numbers left but no parts
            return Integer.MAX_VALUE;

        if (dp[start][parts] != null) // already solved
            return dp[start][parts];

        int ans = Integer.MAX_VALUE;
        int sum = 0;

        for (int end = start; end <= nums.length - parts; end++) {

            sum += nums[end]; // current subarray sum

            int remainingAnswer = helper(nums, end + 1, parts - 1);

            int maxsum = Math.max(sum, remainingAnswer); // largest after this split

            ans = Math.min(ans, maxsum); // best among all splits
        }

        dp[start][parts] = ans; // save result

        return ans;
    }
}