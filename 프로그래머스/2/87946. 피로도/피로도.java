import java.util.*;
class Solution {
    static boolean[] checked ;
        static int count = 0;
        private void dfs(int depth,int k, int[][] dungeons){
            for(int i = 0;i< dungeons.length;i++){
                if(checked[i]||k<dungeons[i][0]) continue;
                checked[i]=true;
                dfs(depth+1,k-dungeons[i][1],dungeons);
                checked[i]=false;
            }
            count=Math.max(count,depth);

        }
        public int solution(int k, int[][] dungeons) {
            checked = new boolean[dungeons.length];
            dfs(0,k,dungeons);
            return count;
        }
}