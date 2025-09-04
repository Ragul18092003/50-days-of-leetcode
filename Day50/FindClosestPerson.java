// Day 50: Find Closest Person
// Problem: https://leetcode.com/problems/find-closest-person/

class Solution {
    public int findClosest(int x, int y, int z) {
        int distx = Math.abs(x - z);
        int disty = Math.abs(y - z);
        if(distx<disty)
        {
            return 1;
        }
        else if(disty<distx)
        {
            return 2;
        }
        else
        {
            return 0;
        }
    }
}
