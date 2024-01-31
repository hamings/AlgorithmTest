import java.util.*;
class Solution {
        public int[] solution(int rows, int columns, int[][] queries) {
            int[][] nums = setNumberArr(rows, columns);
            List<Range> rangeList = changeRangeList(queries);
            if(rangeList.size()==1) return new int[]{nums[rangeList.get(0).fromRow][rangeList.get(0).fromCol]};
            int[] answer = new int[rangeList.size()];
            for(int i = 0;i<answer.length;i++){
                Range range = rangeList.get(i);
                answer[i]=moveAndFindMin(nums,range);
            }

            return answer;
        }
        private int moveAndFindMin(int[][] nums, Range range){
            int preNum = nums[range.fromRow][range.fromCol];
            int minNum = preNum;
            int[] dRow = {0,1,0,-1};
            int[] dCol = {1,0,-1,0};
            int indexRow = range.fromRow;
            int indexCol = range.fromCol;
            for(int i=0;i<4;i++){
                while(true){
                    int nextRow = indexRow+dRow[i];
                    int nextCol = indexCol+dCol[i];
                    if(!(nextRow>=range.fromRow&&nextRow<=range.toRow&&nextCol>=range.fromCol&&nextCol<=range.toCol)) break;
                    int temp = nums[nextRow][nextCol];
                    nums[nextRow][nextCol] = preNum;
                    preNum=temp;
                    minNum = Math.min(minNum,preNum);
                    indexRow=nextRow;
                    indexCol=nextCol;
                }
            }
            return minNum;

        }
        private int[][] setNumberArr(int rows, int columns){
            int[][] numArr = new int[rows+1][columns+1];
            int count=1;
            for(int i = 1;i<=rows;i++){
                for(int j = 1;j<=columns;j++){
                    numArr[i][j]=count++;
                }
            }
            return numArr;
        }
        private List<Range> changeRangeList(int[][] queries){
            List<Range> rangeList = new ArrayList<>();
            for (int[] query : queries) {
                int fromRow = query[0];
                int fromCol = query[1];
                int toRow = query[2];
                int toCol = query[3];
                rangeList.add(new Range(fromRow,fromCol,toRow,toCol));
            }
            return rangeList;
        }
        private class Range{
            private final int fromRow;
            private final int fromCol;
            private final int toRow;
            private final int toCol;

            public Range(int fromRow, int fromCol, int toRow, int toCol) {
                this.fromRow = fromRow;
                this.fromCol = fromCol;
                this.toRow = toRow;
                this.toCol = toCol;
            }
        }
    }