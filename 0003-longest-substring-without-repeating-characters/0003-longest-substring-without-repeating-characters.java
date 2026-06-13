class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int l=0; int r=0; int w=0; int max=0;
        while(r<s.length()){
            if(set.contains(s.charAt(r))){
                while(set.contains(s.charAt(r))){ 
                    set.remove(s.charAt(l));
                    l++; //keep removing ele 1 by 1 from the left till it doesnt contain 
                }
                set.add(s.charAt(r));  //add newly unique ele for new window
                w=r-l+1;
                if(w>max) max=w;
            }else{
                set.add(s.charAt(r)); //ADD TO HASHSET, IF new element
                w=r-l+1;
                if(w>max) max=w; 
            }
            r++;
        }
    return max;
  }
}