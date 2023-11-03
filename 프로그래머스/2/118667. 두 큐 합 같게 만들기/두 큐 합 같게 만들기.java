import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> queueA = new LinkedList<>();
            Queue<Integer> queueB = new LinkedList<>();
            long sumQueue1 = 0;
            long sumQueue2 = 0;
            for (int a : queue1) {
                queueA.add(a);
                sumQueue1+=a;
            }
            for (int b : queue2) {
                queueB.add(b);
                sumQueue2+=b;
            }

            long totalSize = queue1.length*4;

            int count = 0;
            while(totalSize-->0){
                if(sumQueue1==sumQueue2){
                    break;
                } else if (sumQueue1<sumQueue2) {
                    int temp = queueB.poll();
                    sumQueue2-=temp;
                    queueA.add(temp);
                    sumQueue1+=temp;
                }else{
                    int temp = queueA.poll();
                    sumQueue1-=temp;
                    queueB.add(temp);
                    sumQueue2+=temp;
                }
                count++;
            }
            return sumQueue1==sumQueue2? count:-1;
    }
}