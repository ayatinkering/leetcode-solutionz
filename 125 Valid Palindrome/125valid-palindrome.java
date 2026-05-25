class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toUpperCase().toCharArray();
        int l=0; int r=arr.length-1; char temp; int i=0;
        while(l<r){
            if ((65<=arr[l] && arr[l]<=90) || (48<=arr[l] && arr[l]<=57)){
                if ((65<=arr[r] && arr[r]<=90)|| (48<=arr[r] && arr[r]<=57)){
                    if (arr[l]!=arr[r]) return false;
                    else l++; r--;
                }else r--;
            }else l++;
        } return true;
    }
}