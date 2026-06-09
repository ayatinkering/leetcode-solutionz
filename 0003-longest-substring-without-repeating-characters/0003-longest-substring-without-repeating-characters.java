class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals(" ")) return 1;
        HashSet<Character> set=new HashSet<>();
        int l=0; int r=0; int w=0; int max=0;
        while(r<s.length()){
            if(set.contains(s.charAt(r))){
                while(set.contains(s.charAt(r))){
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(s.charAt(r)); 
                w=r-l+1;
                if(w>max) max=w;
            }else{
                set.add(s.charAt(r));
                w=r-l+1;
                if(w>max) max=w; 
            }
            r++;
        }
    return max;
  }
}