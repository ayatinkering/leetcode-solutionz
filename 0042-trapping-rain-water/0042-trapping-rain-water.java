class Solution {
    public int trap(int[] height) {
        int area=0;
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<height.length;i++){
            if(stk.isEmpty() || height[i]<=height[stk.peek()]){
                stk.push(i); //pushing INDEX into stack
            }else{
                while(!stk.isEmpty() && height[i]>height[stk.peek()]){
                int rwall=height[i];
                int base=height[stk.pop()];
                if(stk.isEmpty()) break;
                int lwall=height[stk.peek()];
                int width=i-stk.peek()-1; //no of squares from lwall to rwall
                int h=Math.min(rwall,lwall)-base; //heoght from base to min wall
                area+=h*width;
                }
                stk.push(i);
            }
        }
        return area;
    }
}