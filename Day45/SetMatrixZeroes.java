// Day 45: Set Matrix Zeroes
// Problem: https://leetcode.com/problems/set-matrix-zeroes/

class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        Set<Integer> rzero=new HashSet<>();
        Set<Integer> czero=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    rzero.add(i);
                    czero.add(j);
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(rzero.contains(i) || czero.contains(j))
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}
