// Day 13: Cells with Odd Values in a Matrix
// Problem: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/


class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count=0;
        int[][] arr=new int[m][n];
        for(int i=0;i<indices.length;i++)
        {
            int x=indices[i][0];
            int y=indices[i][1];
            for(int j=0;j<n;j++)
            {
                arr[x][j]+=1;
            }
            for(int j=0;j<m;j++)
            {
                arr[j][y]+=1;
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]%2!=0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
