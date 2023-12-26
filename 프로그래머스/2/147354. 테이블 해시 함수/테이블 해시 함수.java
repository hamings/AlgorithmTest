import java.util.*;
class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int realCol = col-1;
            Arrays.sort(data,(o1, o2) -> o1[realCol]==o2[realCol]? o2[0]-o1[0]:o1[realCol]-o2[realCol]);
            int sum = 0;
            for(int i = row_begin-1;i<row_end;i++){
                int sSum = 0;
                for(int j=0;j<data[i].length;j++){
                    sSum+=data[i][j]%(i+1);
                }
                sum = (sSum^sum);
            }

            return sum;
    }
}