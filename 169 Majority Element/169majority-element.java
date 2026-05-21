class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0; int pos=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>max){
                max=map.get(i);
                pos=i;
            }
        }
        return pos;
    }
}