import java.util.*;
class Solution {
     static boolean[][] visited;
        static int sum;
        static final int[] dx = {0,0,-1,1};
        static final int[] dy = {-1,1,0,0};
        public int[] solution(String[] maps){
            char[][] chars = new char[maps.length][maps[0].length()];
            visited = new boolean[maps.length][maps[0].length()];
            for(int i = 0;i<maps.length;i++){
                chars[i] = maps[i].toCharArray();
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            for(int i = 0;i< chars.length;i++){
                for(int j = 0;j<chars[i].length;j++){
                    if(chars[i][j]=='X'||visited[i][j]) continue;
                    sum = 0;
                    dfs(i,j,chars,visited);
                    arrayList.add(sum);
                }
            }
            if(arrayList.size()==0) return new int[]{-1};
            Collections.sort(arrayList);
            int[] answer = new int[arrayList.size()];
            for(int i = 0;i< answer.length;i++){
                answer[i]= arrayList.get(i);
            }
            return answer;
        }
        public void dfs(int y, int x, char[][] chars, boolean[][] visited){
            visited[y][x]= true;
            sum+=Character.getNumericValue(chars[y][x]);
            for(int k = 0;k<4;k++){
                int newX = x+dx[k];
                int newY = y+dy[k];
                if(newX<0||newY<0||newX>=visited[0].length||newY>=visited.length||visited[newY][newX]) continue;
                if(chars[newY][newX]=='X') continue;
                dfs(newY, newX,chars,visited);
            }
        }
}