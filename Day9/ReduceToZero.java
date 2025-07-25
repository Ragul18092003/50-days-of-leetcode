// Day 9 (Extra): Number of Steps to Reduce a Number to Zero
// Problem: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        while(num>0)
        {
            if(num%2==0)
            {
                num/=2;
                count++;
            }
            else
            {
                num-=1;
                count++;
            }
        }
        return count;
    }
}
