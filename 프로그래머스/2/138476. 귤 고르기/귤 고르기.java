import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int[] arr = new int[10000001];
            for (int a : tangerine) {
                arr[a]++;
            }
            Integer[] arrInteger = Arrays.stream(arr).boxed().toArray(Integer[]::new);
            Arrays.sort(arrInteger, Collections.reverseOrder());
            int answer = 1;
            if (arrInteger[0] >= k) return answer;
            for (int i = 1; i < arr.length; i++) {
                arrInteger[i] += arrInteger[i - 1];
                answer++;
                if (arrInteger[i] >= k) break;
            }
            return answer;
    }
}