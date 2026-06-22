class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stk = new Stack<>();

        for (String s : tokens) {

            if (s.equals("+") || s.equals("-") ||s.equals("*") || s.equals("/")) {
                int a = stk.pop();
                int b = stk.pop();
                int res;
                if (s.equals("+"))
                    res = b + a;
                else if (s.equals("-"))
                    res = b - a;
                else if (s.equals("*"))
                    res = b * a;
                else
                    res = b / a;
                stk.push(res);
            } else {
                stk.push(Integer.parseInt(s));
            }
        }
        return stk.pop();
    }
}