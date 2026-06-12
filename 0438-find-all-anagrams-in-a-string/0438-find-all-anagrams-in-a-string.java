class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) {
            return ans;
        }

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        int matches = 0;

        for (int i = 0; i < 26; i++) {
            if (pCount[i] == sCount[i]) {
                matches++;
            }
        }

        int l = 0;

        for (int r = p.length(); r < s.length(); r++) {

            if (matches == 26) {
                ans.add(l);
            }

            int index = s.charAt(r) - 'a';

            if (pCount[index] == sCount[index]) {
                matches--;
            }

            sCount[index]++;

            if (pCount[index] == sCount[index]) {
                matches++;
            }

            index = s.charAt(l) - 'a';

            if (pCount[index] == sCount[index]) {
                matches--;
            }

            sCount[index]--;

            if (pCount[index] == sCount[index]) {
                matches++;
            }

            l++;
        }

        if (matches == 26) {
            ans.add(l);
        }

        return ans;
    }
}