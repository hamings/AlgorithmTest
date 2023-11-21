import java.util.*;
class Solution {
    private static int[][] arr = new int[501][501];
    private int max(int x, int y, int[][] triangle){
        if(y==triangle.length) return 0;
        if(arr[x][y]!=-1) return arr[x][y];
        return arr[x][y]=triangle[y][x]+Math.max(max(x,y+1,triangle),max(x+1,y+1,triangle));
    }
    public int solution(int[][] triangle) {
        for(int[] row: arr){
            Arrays.fill(row,-1);
        }

        return max(0,0,triangle); 
    }
}