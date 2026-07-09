class Solution {

    public String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String curr = "";
        int num = 0;

        for (char c : s.toCharArray()) {

            if (Character.isDigit(c)) {

                num = num * 10 + (c - '0');
            }

            else if (c == '[') {

                countStack.push(num);
                stringStack.push(curr);

                num = 0;
                curr = "";
            }

            else if (c == ']') {

                int repeat = countStack.pop();
                String prev = stringStack.pop();

                StringBuilder temp = new StringBuilder(prev);

                for (int i = 0; i < repeat; i++) {
                    temp.append(curr);
                }

                curr = temp.toString();
            }

            else {

                curr += c;
            }
        }

        return curr;
    }
}