// Problem Number: 46
// Problem Name: Permutations
// Difficulty: Medium
// Topic: Backtracking
// Problem Link: https://leetcode.com/problems/permutations/
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    static List<List<Integer>> list2;
    static List<Integer> list1;
    static boolean u[];
    public List<List<Integer>> permute(int[] nums) {
        list1=new ArrayList<>();
        list2=new ArrayList<>();
        u=new boolean[nums.length];
        find(nums);
        return list2;
    }
    static void find(int a[]){
        if(list1.size()==a.length){
            list2.add(new ArrayList<>(list1));
            return;
        }
        for(int i=0;i<a.length;i++){
            if(u[i]){
                continue;
            }
            list1.add(a[i]);
            u[i]=true;

            find(a);
            list1.remove(list1.size()-1);
            u[i]=false;
        }
    }
}