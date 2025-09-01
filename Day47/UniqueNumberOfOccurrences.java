// Day 47: Unique Number of Occurrences
// Problem: https://leetcode.com/problems/unique-number-of-occurrences/

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int nums:arr)
        {
            map.put(nums,map.getOrDefault(nums,0)+1);
        }
        //boolean found=false;
        Set<Integer> set=new HashSet<>();
        for(int key:map.keySet())
        {
            if(!set.contains(map.get(key)))
            {
                set.add(map.get(key));
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
