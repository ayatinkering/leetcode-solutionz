class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];
        for (int i:map.keySet()){
            int freq=map.get(i);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(i);
        }

        int[] ans = new int[k];
        int j=0;
        for(int i=bucket.length-1; i>=0 && j<k; i--){
            if(bucket[i]!=null){
                for(int num:bucket[i]){
                    ans[j++]=num;
                    if(j==k) 
                        break;
                }
            }
        }
        return ans;
    }
}