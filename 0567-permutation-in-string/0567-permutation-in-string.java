class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] s1count=new int[26];
        int[] s2count=new int[26];

        for(int i=0;i<s1.length();i++){
            s1count[s1.charAt(i)-'a']++;
            s2count[s2.charAt(i)-'a']++;
        }

        int matches=0;
        for(int i=0;i<26;i++){
            if(s1count[i]==s2count[i])
                matches++;
        }

        int l=0;int r=s1.length();
        while(r<s2.length()){
            if(matches==26) return true;

            //ADD RIGHT CHARACTER
            int index=s2.charAt(r)-'a';
            if (s1count[index]==s2count[index]) matches--; //LOSING A MATCH
            s2count[index]++; //adding its count for that 1 ele shift
            if (s1count[index]==s2count[index]) matches++; //GAINING MATCH

            //REMOVE LEFT CHARACTER
            index=s2.charAt(l)-'a';
            if(s1count[index]==s2count[index]) matches--;
            s2count[index]--; //removing its count for that 1 ele shift
            if(s1count[index]==s2count[index]) matches++; 

            l++;r++;
        }

        return matches==26;
    }
}