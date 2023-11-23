import java.util.*;
class Solution {
    public int solution(int n, int[][] results) {
        int answer = 0;
        boolean[][] graph = new boolean[n][n];
        for(int i = 0;i<results.length;i++){
            graph[results[i][0]-1][results[i][1]-1]=true;
        }
        for(int u = 0;u<n;u++ ){
            int wins = countForward(u,graph,new boolean[n])-1;
            int loses = countBackward(u,graph, new boolean[n])-1;
            if(wins+loses+1==n) {
                answer++;
            }
        }
        
        return answer;
    }
    private int countForward(int u, boolean[][] graph,boolean[] isVisited){
        int count=1;
        for(int v = 0;v<graph.length;v++){
            if(graph[u][v]!=true||isVisited[v]) continue;
            isVisited[v]=true;
            count+=countForward(v,graph,isVisited);
        }
        return count;
    }
    private int countBackward(int u, boolean[][] graph,boolean[] isVisited){
        int count=1;
        for(int v = 0;v<graph.length;v++){
            if(graph[v][u]!=true||isVisited[v]) continue;
            isVisited[v]=true;
            count+=countBackward(v,graph,isVisited);
        }
        return count;
    }
}