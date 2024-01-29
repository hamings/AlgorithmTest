
import java.util.*;
class Solution {
    public int solution(String[] maps) {
            boolean[][] blocked = new boolean[maps.length][maps[0].length()];
            Point start = null;
            Point lever = null;
            Point exit = null;

            for(int i = 0;i< maps.length;i++){
                char[] chars = maps[i].toCharArray();
                for(int j = 0;j<maps[i].length();j++){
                    char c = chars[j];
                    if(c=='X'){
                        blocked[i][j]=true;
                    }
                    else if(c=='S'){
                        start=new Point(i,j);
                    }else if(c=='L'){
                        lever = new Point(i,j);
                    }else if(c=='E'){
                        exit = new Point(i,j);
                    }
                }
            }
            int length1 = bfs(start,lever,blocked,new boolean[blocked.length][blocked[0].length]);
            if(length1==-1) return length1;
            int length2 = bfs(lever,exit,blocked,new boolean[blocked.length][blocked[0].length]);
            if(length2==-1) return length2;

            return length1+length2;
        }
        private int bfs(Point from, Point to,boolean[][] blocked, boolean[][] isVisited){
            int[][] arr = new int[blocked.length][blocked[0].length];
            isVisited[from.row][from.col] = true;
            int[] dRow = {-1,1,0,0};
            int[] dCol = {0,0,-1,1};
            Queue<Point> queue = new LinkedList<>();
            queue.add(from);
            while(!queue.isEmpty()){
                Point next = queue.poll();
                for(int i=0;i<4;i++){
                    int nextRow = next.row+dRow[i];
                    int nextCol = next.col+dCol[i];
                    if(nextRow<0||nextRow>=blocked.length||nextCol<0||nextCol>=blocked[0].length) continue;
                    if(blocked[nextRow][nextCol]||isVisited[nextRow][nextCol]) continue;
                    queue.add(new Point(nextRow,nextCol));
                    arr[nextRow][nextCol]=arr[next.row][next.col]+1;
                    isVisited[nextRow][nextCol]=true;
                    if(nextRow==to.row&&nextCol==to.col) return arr[nextRow][nextCol];
                }
            }
            return -1;

        }
        private class Point{
            private final int row;
            private final int col;

            public Point(int row, int col) {
                this.row = row;
                this.col = col;
            }
        }
    
}