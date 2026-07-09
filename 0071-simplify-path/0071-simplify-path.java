class Solution {
    public String simplifyPath(String path) {

        Stack<String> stk = new Stack<>();

        String[] parts = path.split("/");

        for (String s : parts) {

            if (s.equals("") || s.equals(".")) {
                continue;
            }

            if (s.equals("..")) {

                if (!stk.isEmpty())
                    stk.pop();
            }

            else {
                stk.push(s);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (String dir : stk) {
            ans.append("/").append(dir);
        }

        if (ans.length() == 0)
            return "/";

        return ans.toString();
    }
}