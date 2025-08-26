// Day 41: Median of Two Sorted Arrays
// Problem: https://leetcode.com/problems/median-of-two-sorted-arrays/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        int res[]=new int[n1+n2];
        for(int i=0;i<n1;i++)
        {
            res[i]=nums1[i];
        }
        for(int i=0;i<n2;i++)
        {
            res[n1+i]=nums2[i];
        }
        Arrays.sort(res);
        int n=res.length;
        if(n%2==0)
        {
            return (res[(n/2)-1]+res[n/2])/2.0;
        }
        return (double)res[n/2];
    }
}
