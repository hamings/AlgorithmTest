package programmers;
import java.util.*;

public class Q12906 {
    public static class Solution {
        public int[] solution(int[] arr) {
            int num = 10;
            ArrayList<Integer> arrayList = new ArrayList<>();
            for(int a : arr){
                if(num!=a){
                    arrayList.add(a);
                    num=a;
                }
            }
            int[] answer = new int[arrayList.size()];
            for(int i = 0;i< arrayList.size();i++){
                answer[i]=arrayList.get(i).intValue();
            }return answer;

        }
    }

}
