class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (p.length()>s.length()) return list;

        int[] pcount=new int[26];
        int[] scount=new int[26];

        for(int i=0;i<p.length();i++){
            pcount[p.charAt(i)-'a']++;
            scount[s.charAt(i)-'a']++;
        }
        int matches=0;
        for(int i=0;i<26;i++){
                if(scount[i]==pcount[i]) matches++;
        }
        
        int l=0;int r=p.length();
        while(r<s.length()){
            if (matches==26) list.add(l);

            //add right char
            int index=s.charAt(r)-'a';
            if(scount[index]==pcount[index]) matches--;
            scount[index]++;
            if(scount[index]==pcount[index]) matches++;

            //remove left char (shift window front)
            index=s.charAt(l)-'a';
            if(scount[index]==pcount[index]) matches--;
            scount[index]--;
            if(scount[index]==pcount[index]) matches++;

            l++;r++;
        }
        if(matches == 26) list.add(l); //for LAST match
        return list;
    }
}