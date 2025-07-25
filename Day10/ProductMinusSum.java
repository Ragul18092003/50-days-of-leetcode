// Day 10: Subtract the Product and Sum of Digits of an Integer
// Problem: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

class Solution {
    public int subtractProductAndSum(int n) {
        int prod=1,sum=0;
        while(n>0)
        {
            int rem=n%10;
            prod*=rem;
            sum+=rem;
            n/=10;
        }
        return prod-sum;
    }
}
