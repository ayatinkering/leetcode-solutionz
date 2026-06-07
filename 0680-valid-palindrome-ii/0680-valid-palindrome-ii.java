//cant use GREEDY VERSION, as may be cases where both (arr[l+1] == arr[r] && arr[l] == arr[r-1]) satisfy, code picks the first one (left side), but later on in the string, the wrong one mightve been picked

class Solution { 
    public boolean validPalindrome(String s) {
        int l=0;int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                if (ispalin(s, l + 1, r)|| ispalin(s,l,r-1)){
                    return true;
                }
                else return false;
            }
            l++; r--;
        }
        return true;
    }

    public boolean ispalin(String s,int l,int r){
        while(l<r){
            if (s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++; r--;
        }
        return true;
    }
}