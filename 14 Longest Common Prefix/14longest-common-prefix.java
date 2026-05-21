class Solution {
    public String longestCommonPrefix(String[] strs) {

        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int matched = 0;
            for (int j = 0; j < Math.min(strs[i].length(),ans.length()); j++) {
                if (strs[i].charAt(j) == ans.charAt(j))
                    matched++;
                else
                    break;
            }

            ans = ans.substring(0, matched);
            if (ans.equals(""))
                return "";
        }

        return ans;
    }
}