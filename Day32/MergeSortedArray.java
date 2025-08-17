// Day 32: Merge Sorted Array
// Problem: https://leetcode.com/problems/merge-sorted-array/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1,p2=n-1;
        int index=m+n-1;
        while(p2>=0)
        {
            if(p1>=0)
            {
                nums1[index]=Math.max(nums1[p1],nums2[p2]);
                if(nums1[p1]>nums2[p2])
                {
                    p1--;
                }
                else
                {
                    p2--;
                }
            }
            else
            {
                nums1[index]=nums2[p2];
                p2--;
            }
            index--;
        }
        System.out.print(Arrays.toString(nums1));
    }
}
