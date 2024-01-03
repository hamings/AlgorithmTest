import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 2;i<=count;i++){
            deque.add(i);
        }
        String[] strings = br.readLine().split(" ");

        int[] nums = new int[count];
        for(int i = 0;i< nums.length;i++){
            nums[i]=Integer.parseInt(strings[i]);
        }

        StringBuilder stringBuilder = new StringBuilder("1 ");
        int move = nums[0];
        while (!deque.isEmpty()){
            if(move>0){
                for(int i = 1;i<move;i++){
                    deque.addLast(deque.pollFirst());
                }
                int next = deque.pop();
                stringBuilder.append(next).append(" ");
                move = nums[next-1];

            }else{
                for(int i = move;i<0;i++){
                    deque.addFirst(deque.pollLast());
                }
                int next = deque.pop();
                stringBuilder.append(next).append(" ");
                move = nums[next-1];
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
