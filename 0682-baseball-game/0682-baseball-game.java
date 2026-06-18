class Solution {
    public int calPoints(String[] operations) {
        int sum=0; int top;
        Stack<Integer> stack = new Stack<>();
        for(String i : operations){
            if(i.equals("+")){
                top=stack.pop();
                int secondtop=stack.peek();
                stack.push(top);
                stack.push(top+secondtop);
            }else if (i.equals("D")){
                top=stack.peek();
                stack.push(2*top);
            }else if (i.equals("C")){
                stack.pop();
            }else
                stack.push(Integer.parseInt(i));
        }
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}