// Day 42: Happy Number
// Problem: https://leetcode.com/problems/happy-number/

class Solution {
    public boolean isHappy(int n) {
        int sum=0,temp=0;
        while(n!=1 && n!=4)
        {
            sum=0;
            while(n>0)
            {
                temp=n%10;
                sum+=(temp*temp);
                n/=10;
            }
            n=sum;
        }
        if(n==1)
        {
            return true;
        }
        return false;
    }
}
