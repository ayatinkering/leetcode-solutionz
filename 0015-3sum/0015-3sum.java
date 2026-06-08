class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) { //kkip duplicate starting elements
                continue;
            }
            if (nums[i] > 0) { //no sol possible w this starting ele onwards as to get sum 0, it should be negative number
                break;
            }

            int l=i+1; int r=nums.length-1;
            while (l<r) {
                int sum=nums[i]+nums[l]+nums[r];
                if (sum<0) 
                    l++;
                else if (sum>0) 
                    r--;
                else{
                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[l]);
                    ans.add(nums[r]);
                    listans.add(ans);
                    l++; r--;

                    while (l < r && nums[l] == nums[l - 1]) {
                        l++; //skip duplicates on left
                    }
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;  //skip duplicates on right
                    }
                }
            }
        }
        return listans;
    }
}