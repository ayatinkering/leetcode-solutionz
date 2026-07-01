class Solution {
    public int trap(int[] height) {
        int area = 0;
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < height.length; i++) {

            while (!stk.isEmpty() && height[i] > height[stk.peek()]) {

                int base = height[stk.pop()];

                if (stk.isEmpty()) break;

                int lwall = height[stk.peek()];
                int rwall = height[i];

                int width = i - stk.peek() - 1;
                int h = Math.min(lwall, rwall) - base;

                area += width * h;
            }

            stk.push(i);   // <-- this was missing
        }

        return area;
    }
}