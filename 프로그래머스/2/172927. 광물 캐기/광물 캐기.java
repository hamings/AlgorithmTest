import java.util.*;
class Solution {
   class Mineral{
            private final int diamond;
            private final int iron;
            private final int stone;

             Mineral(int diamond, int iron, int stone) {
                 this.diamond = diamond;
                 this.iron = iron;
                 this.stone = stone;
             }
         }
        public int solution(int[] picks, String[] minerals){
            List<Mineral> list = new ArrayList<>();
            int[][] num = {{1,1,1},{5,1,1},{25,5,1}};
            int totalCount = Arrays.stream(picks).sum();
            for(int i = 0;i< minerals.length;i+=5) {
                if(totalCount==0) break;
                int diamond = 0;
                int iron = 0;
                int stone = 0;
                for (int j = i; j < i + 5; j++) {
                    if(j==minerals.length) break;
                    int col = minerals[j].equals("diamond")?0:minerals[j].equals("iron")?1:2;
                    diamond+=num[0][col];
                    iron+=num[1][col];
                    stone+=num[2][col];
                }
                list.add(new Mineral(diamond,iron,stone));
                totalCount--;
            }
            int answer = 0;
            Collections.sort(list,(o1, o2) -> o2.stone-o1.stone);
            for(Mineral mineral : list){
                int dia = mineral.diamond;
                int iron = mineral.iron;
                int stone = mineral.stone;
                if(picks[0]>0){
                    answer+=dia;
                    picks[0]--;
                    continue;
                }
                if(picks[1]>0){
                    answer+=iron;
                    picks[1]--;
                    continue;
                }
                if(picks[2]>0){
                    answer+=stone;
                    picks[2]--;
                }

            }
            return answer;
        }
    
}