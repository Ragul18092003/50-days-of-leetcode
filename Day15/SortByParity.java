// Day 15: Sort Array by Parity
// Problem: https://leetcode.com/problems/sort-array-by-parity/

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0,j=nums.length-1;
        while(i<j)
        {
            if(nums[i]%2==0)
            {
                i++;
            }
            else if(nums[j]%2==1)
            {
                j--;
            }
            else
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }
        return nums;
    }
}
