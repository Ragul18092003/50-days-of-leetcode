// Day 28: Available Captures for Rook
// Problem: https://leetcode.com/problems/available-captures-for-rook/

class Solution {
    public int numRookCaptures(char[][] board) {
        boolean a=false;;

        int row=0,col=0;
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if(board[i][j]=='R')
                {
                    a=true;
                    row=i;
                    col=j;
                    break;
                }
            }
            if(a)
            {
                break;
            }
        }
        int count=0;
        for(int i=row+1;i<8;i++)
        {
            if(board[i][col]=='p')
            {
                count++;
                break;
            }
            else if(board[i][col]=='B')
            {
                break;
            }   
        }
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='p')
            {
                count++;
                break;
            }
            else if(board[i][col]=='B')
            {
                break;
            }   
        }
        for(int i=col+1;i<8;i++)
        {
            if(board[row][i]=='p')
            {
                count++;
                break;
            }
            else if(board[row][i]=='B')
            {
                break;
            }  
        }
        for(int i=col-1;i>=0;i--)
        {
            if(board[row][i]=='p')
            {
                count++;
                break;
            }
            else if(board[row][i]=='B')
            {
                break;
            } 
        }
        return count;
    }
}
