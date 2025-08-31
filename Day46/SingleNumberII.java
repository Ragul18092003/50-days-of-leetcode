// Day 46: Single Number II
// Problem: https://leetcode.com/problems/single-number-ii/

class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet())
        {
            if(map.get(key)==1)
            {
                return key;
            }
        }
        return -1;
    }
}
