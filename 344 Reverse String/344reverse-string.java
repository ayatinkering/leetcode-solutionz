class Solution {
    public void reverseString(char[] s) {
        int l=0; int r=s.length-1; char temp; int i=0;
        while(i<s.length/2){
            temp=s[l]; 
            s[l]=s[r]; 
            s[r]=temp;
            l++;r--;i++;
        }
    }
}