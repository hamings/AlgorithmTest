package programmers;

public class Q86491 { // 최소 직사각형
    public static class Solution {
        public int solution(int[][] sizes) {
            int temp=0;
            for(int i = 0;i<sizes.length;i++){
                if(sizes[i][0]<sizes[i][1]){
                    temp = sizes[i][0];
                    sizes[i][0]=sizes[i][1];
                    sizes[i][1]=temp;
                }
            }
            int width = sizes[0][0];
            int height = sizes[0][1];
            for(int j = 0;j<sizes.length-1;j++){
                width = Math.max(width, sizes[j + 1][0]);
                height = Math.max(height, sizes[j + 1][1]);
            }
            int answer = width*height;
            return answer;
        }
    }
}
