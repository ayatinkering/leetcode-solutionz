class Solution {
    public int removeDuplicates(int[] nums) {
        int[] unique=new int[nums.length];
        unique[0]=nums[0]; int k=1;

        int s=0; int f=1; int j=1;
        while(f<nums.length){
            if(nums[f]!=nums[s]){
                unique[j++]=nums[f];
                s=f;
                f++;
                k++;
            }else{
                f++;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=unique[i];
        }
        return k;
    }
}