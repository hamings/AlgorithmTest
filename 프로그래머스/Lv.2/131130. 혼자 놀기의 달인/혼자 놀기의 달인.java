import java.util.*;
class Solution {
  public static boolean[] isVisited;
        public static ArrayList<Integer> arrayList = new ArrayList<>();

        public int solution(int[] cards) {
            isVisited = new boolean[cards.length];
            for(int i = 0;i<cards.length;i++){
                if(isVisited[i]) continue;
                dfs(cards,i,0);
            }
            if(arrayList.size()==1) return 0;
            Collections.sort(arrayList, Collections.reverseOrder());
            return arrayList.get(0)*arrayList.get(1);
        }
        private void dfs(int[] cards, int index, int count){
            if(isVisited[index]){
                arrayList.add(count);
                return;
            }
            isVisited[index]=true;
            dfs(cards,cards[index]-1,count+1);
        }
}