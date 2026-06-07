class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l1=0;int l2=0;
        int[] nums3 = new int[m+n]; 
        for(int i=0;i<m+n;i++){
            if(l1>=m){
                nums3[i]=nums2[l2];
                l2++;
            }
            else if (l2>=n){
                nums3[i]=nums1[l1];
                l1++;
            }
            else if(nums1[l1]<=nums2[l2]){
                nums3[i]=nums1[l1];
                l1++;
            }
            else if (nums1[l1]>nums2[l2]){
                nums3[i]=nums2[l2];
                l2++;
            }
        }
        for(int i=0;i<m+n;i++){
            nums1[i]=nums3[i];
        }
    }
}