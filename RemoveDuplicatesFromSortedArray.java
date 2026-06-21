class Solution {
    public int removeDuplicates(int[] nums) {
          HashSet<Integer> set = new HashSet<>();
          int i=0;
          for(int x:nums)
          {
            if(!set.contains(x)){
            set.add(x);
            nums[i]=x;
            i++;
          }
          }
          return i;
        }
    }
