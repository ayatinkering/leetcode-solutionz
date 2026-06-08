class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            // Skip duplicate starting elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // No solution possible beyond this point
            if (nums[i] > 0) {
                break;
            }

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {

                int sum = nums[i] + nums[l] + nums[r];

                if (sum < 0) {
                    l++;
                }
                else if (sum > 0) {
                    r--;
                }
                else {

                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[l]);
                    ans.add(nums[r]);

                    listans.add(ans);

                    l++;
                    r--;

                    // Skip duplicate left values
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }

                    // Skip duplicate right values
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }
                }
            }
        }

        return listans;
    }
}