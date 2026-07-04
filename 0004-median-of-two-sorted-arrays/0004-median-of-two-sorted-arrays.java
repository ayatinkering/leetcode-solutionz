class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=0;int n2=0;
        int[] a=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length+nums2.length;i++){
            if(n1==nums1.length){
                a[i]=nums2[n2]; n2++;
            }
            else if(n2==nums2.length){
                a[i]=nums1[n1]; n1++;
            }
            else if (nums1[n1]<=nums2[n2]){
                a[i]=nums1[n1];
                n1++;
            }
            else {
                a[i]=nums2[n2];
                n2++;
            }
        }
        int l=0; double m; int r=a.length-1;

        if(r%2==0) m=a[l+(r-l)/2];
        else m=(a[r/2]+a[r/2 +1])/2.0;

        return m;

    }
}