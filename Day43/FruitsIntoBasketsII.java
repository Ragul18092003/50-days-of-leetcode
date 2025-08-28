// Day 43: Fruits Into Baskets II
// Problem: https://leetcode.com/problems/fruits-into-baskets-ii/

class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        boolean[] visit=new boolean[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(visit[j]==false)
                {
                    if(baskets[i]>=fruits[j])
                    {
                        visit[j]=true;
                        break;
                    }
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(visit[i]==false)
            {
                count++;
            }
        }
        return count;
    }
}
