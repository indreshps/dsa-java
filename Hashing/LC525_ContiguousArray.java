class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0, res=0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]==1){
                sum+= 1;
            }
            else {
                sum-=1;
            }
            if(map.containsKey(sum)){
                res=Math.max(res, i- map.get(sum));
            }
            else if(!map.containsKey(sum)&&sum!=0){
                map.put(sum, i);
            }
            else if(sum==0){
                res= Math.max(res, i+1);
            }
        }

        return res;
        
    }
}