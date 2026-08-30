class Solution {
    public int majorityElement(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      int max=nums.length/2;
      for(int i=0;i<nums.length;i++)
      {
        if(map.containsKey(nums[i]))
        {
            
            map.put(nums[i],map.get(nums[i])+1);
        }
        else{
            map.put(nums[i],1);
        }
      }
      int ans=0;
      for(int x:map.keySet())
      {
        if(map.get(x)>max)
        {
           
           return x;
        }
      }
      return ans;
    }
}