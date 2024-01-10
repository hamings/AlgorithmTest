import java.util.*;
class Solution {
  public static int rowLength;
        public static int colLength;
        public static int[] dRow = {-1,1,0,0};
        public static int[] dCol = {0,0,-1,1};
        public static boolean[][] booleans;
        public int solution(String[] board) {
            rowLength = board.length;
            colLength = board[0].length();
            booleans = new boolean[rowLength][colLength];
            Spot index = null;
            Spot goal = null;
            for(int i = 0;i< board.length;i++){
                char[] chars = board[i].toCharArray();
                for(int j = 0;j<chars.length;j++){
                    if(chars[j]=='R'){
                        index = new Spot(i,j,0);
                        continue;
                    }
                    if(chars[j]=='G'){
                        goal = new Spot(i,j,0);
                        continue;
                    }
                    if(chars[j]=='D'){
                        booleans[i][j]=true;
                    }
                }
            }
            return bfs(index,goal);

        }
        private class Spot{
            private final int row;
            private final int col;
            private final int depth;

            public Spot(int row, int col, int depth){
                this.row = row;
                this.col = col;
                this.depth = depth;
            }


        }
        private int bfs(Spot spot, Spot goal){
            Queue<Spot> queue = new LinkedList<>();
            queue.add(spot);
            boolean[][] visited = new boolean[rowLength][colLength];
            visited[spot.row][spot.col]=true;
            while(!queue.isEmpty()){
                Spot s = queue.poll();
                if(s.row == goal.row && s.col == goal.col) return s.depth;
                for(int i = 0;i<4;i++){
                    int newRow = s.row;
                    int newCol = s.col;
                    while(inRange(newRow,newCol)&&!booleans[newRow][newCol]){
                        newRow+=dRow[i];
                        newCol+=dCol[i];
                    }
                    newRow-=dRow[i];
                    newCol-=dCol[i];
                    if(visited[newRow][newCol]||(s.row==newRow&&s.col==newCol)) continue;
                    visited[newRow][newCol]=true;
                    queue.add(new Spot(newRow,newCol,s.depth+1));
                }

            }return -1;

        }
        private boolean inRange(int row, int col){
            return row >= 0 && col >= 0 && row < rowLength && col < colLength;
        }

}