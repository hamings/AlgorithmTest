import java.util.Set;
import java.util.HashSet;
class Solution {
    public double getSlope(int x1, int y1,int x2, int y2){
        return (double) (y2-y1)/(x2-x1);
    }
    public int solution(int[][] dots) {
        double[] arr = new double[6];
        int count = 0;
        for(int i = 0;i<dots.length;i++){
            for(int j = i+1;j<dots.length;j++){
                arr[count++]=getSlope(dots[i][0],dots[i][1],dots[j][0],dots[j][1]);
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==arr[arr.length-i-1]){ 
                return 1;
                                           }
        }
        return 0;
    }
}