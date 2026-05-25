class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }

    public void mergesort(int[] nums, int l,int h){
        if (l<h){
            int mid=(l+h)/2;
            mergesort(nums,l,mid);
            mergesort(nums,mid+1,h);
            merge(nums,l,mid,h);
        }
    }

    public int[] merge(int[] nums,int l,int mid,int h){
        int[] C = new int[h-l+1];
        int i=l;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=h){
            if(nums[i]<nums[j])
                C[k++]=nums[i++];
            else C[k++]=nums[j++];
        }
        while(i<=mid){
            C[k++]=nums[i++];
        }
        while(j<=h){
            C[k++]=nums[j++];
        }
        for(int x=0; x<C.length;x++){
            nums[x+l]=C[x];
        }
        return nums;
    }
}