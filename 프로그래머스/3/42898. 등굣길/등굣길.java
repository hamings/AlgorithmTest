import java.util.*;
class Solution {
    private static int[][] mem = new int[101][101];
    private int count(int x, int y,int w, int h, boolean[][] isPuddles){
        if(x>w||y>h) return 0;
        if(isPuddles[y][x]) return 0;
        if(x==w&&y==h) return 1;
        if(mem[x][y]!=-1) return mem[x][y];
        int total = count(x,y+1,w,h,isPuddles)+count(x+1,y,w,h,isPuddles);
        return mem[x][y]=total%1000000007;
        
}
    public int solution(int m, int n, int[][] puddles) {
        for(int[] i : mem){
        Arrays.fill(i,-1);
        }
        boolean[][] isPuddles = new boolean[101][101];
        for(int[] p: puddles){
            isPuddles[p[1]][p[0]]=true;
        }
        return count(1,1,m,n,isPuddles);
    }
}