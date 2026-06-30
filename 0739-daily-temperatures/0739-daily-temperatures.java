class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
            int[] ans = new int[temperatures.length];  //initalises array of 0s
            Stack<Integer> stk = new Stack<>();
            for(int i=0;i<temperatures.length;i++){
                if(stk.isEmpty() || temperatures[i]<=temperatures[stk.peek()]){
                    stk.push(i);
                }else{
                    while(!stk.isEmpty() && temperatures[i]>temperatures[stk.peek()]){
                        ans[stk.peek()]=i-stk.peek();
                        stk.pop();
                    }
                    stk.push(i);
                }
            }
        return ans;
    }
}