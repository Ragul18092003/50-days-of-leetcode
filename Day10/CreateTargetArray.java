// Day 10: Create Target Array in the Given Order
// Problem: https://leetcode.com/problems/create-target-array-in-the-given-order/

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list=new ArrayList<>();
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            list.add(index[i],nums[i]);
        }
        int idx=0;
        for(int i:list)
        {
            res[idx++]=i;
        }
        return res;
    }
}
