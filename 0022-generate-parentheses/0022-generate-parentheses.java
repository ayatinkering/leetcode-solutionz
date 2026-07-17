public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        backtrack(0, 0, n, ans, s);
        return ans;
    }

    private void backtrack(int openN, int closedN, int n, List<String> ans, StringBuilder s) {
        //BASE if all brackets used, string done
        if (openN == closedN && openN == n) {
            ans.add(s.toString());
            return;
        }

        //1st CONSTRAINT: no of openieng brackets less than n
        if (openN<n) {
            s.append('(');
            backtrack(openN+1, closedN, n, ans, s); //EXPLORE
            s.deleteCharAt(s.length()-1); //remove after exploring
        }

        //2nd CONSTRAING: no of closed ) < open (, to keep it VALID
        if (closedN<openN) {
            s.append(')');
            backtrack(openN, closedN+1, n, ans, s);
            s.deleteCharAt(s.length()-1);
        }
    }

}