import java.util.*;
class Solution {
    public static final int[] dx = {0,0,-1,1};
    public static final int[] dy = {-1,1,0,0};
    private static class State{
        public final int x;
        public final int y;
        public final int step;
        State(int x, int y, int step){
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }
    public int solution(int[][] maps) {
        boolean[][] isVisited = new boolean[maps.length][maps[0].length];
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(0,0,1));
        isVisited[0][0]=true;
        while(!queue.isEmpty()){
            State state = queue.poll();
            if(state.y==maps.length-1&&state.x==maps[state.y].length-1){
                return state.step;
            }
            for(int i = 0;i<4;i++){
                int nx = state.x+dx[i];
                int ny = state.y+dy[i];
                if(ny<0||ny>=maps.length||nx<0||nx>=maps[ny].length){
                    continue;
                }
                if(maps[ny][nx]!=1){
                    continue;
                }
                if(isVisited[ny][nx]) continue;
                isVisited[ny][nx]=true;
                queue.add(new State(nx,ny,state.step+1));
            }
        }return -1;
    }
}