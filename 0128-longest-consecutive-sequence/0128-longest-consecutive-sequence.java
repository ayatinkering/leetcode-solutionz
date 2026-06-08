class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        if(nums.length==0 || nums.length==1)
            return nums.length;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max=0;
        for(int i:set){
            int count=0; int j=0;
            if(!set.contains(i-1)){ //we know it is the starting element
                while(set.contains(i+j)){
                    count++;
                    j++;
                }
            }
            if(count>max) max=count;
        }
        return max;
    }
}