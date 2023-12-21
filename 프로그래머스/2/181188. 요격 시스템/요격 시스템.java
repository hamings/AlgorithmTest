import java.util.*;
class Solution {
    public int solution(int[][] targets){
            Arrays.sort(targets,((o1, o2) -> o1[0]==o2[0]?o1[1]-o2[1]:o1[0]-o2[0]));
            
            Stack<Range> stack = new Stack<>();
            for (int[] target : targets) {
                Range newRange = changeToRange(target[0],target[1]);
                if(stack.isEmpty()) {
                    stack.add(newRange);
                    continue;
                }
                Range before = stack.peek();
                if(before.start<=newRange.start&&newRange.start<= before.end){
                    if(newRange.end<before.end){
                        stack.pop();
                        stack.add(new Range(before.start,newRange.end));
                    }
                    continue;
                }
                stack.add(newRange);
            }
            
            return stack.size();
        }
        private class Range{
            private final double start;
            private final double end;

            public Range(double start, double end) {
                this.start = start;
                this.end = end;
            }
        }
        private Range changeToRange(int start, int end){
            return new Range(start+0.2,end-0.2);
        }
}