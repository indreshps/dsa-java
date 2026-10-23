class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map= new HashMap<>();
        int res=0, curr=0;
        map.put(0,1);

        for(int val : nums){
            curr+= val;
            res+=map.getOrDefault(curr-k, 0);
            map.put(curr, map.getOrDefault(curr,0) +1);

        }

        return res;
        
    }
}