class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
            int[] ans = new int[temperatures.length];  //initalises array of 0s
            for(int i=0;i<temperatures.length-1;i++){
                int c=1;
                for(int j=i+1;j<temperatures.length;j++){
                    if(i>0&&temperatures[i]>temperatures[i-1]&&ans[i-1]==0){
                        ans[i]=0; break;
                    }
                    if(i>0&&temperatures[i]==temperatures[i-1] ){
                        if(ans[i-1]==0) {
                            ans[i]=0;
                            break;
                        } else{
                        ans[i]=ans[i-1]-1;
                        break;}
                    }else{
                    if(temperatures[j]>temperatures[i]){
                        ans[i]=c;
                        break;
                    }else c++;
                    }
                }
            }
        return ans;
    }
}