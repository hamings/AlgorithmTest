import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        ArrayList<Integer> arrayList = new ArrayList<>();
            for(long i=left;i<=right;i++){
                int x = (int) (i/n);
                int y = (int) (i%n);
                arrayList.add(Math.max(x,y)+1);
            }
            return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
}