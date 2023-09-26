import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            return o1-o2>0?1:-1;
        });
        int count = Integer.parseInt(br.readLine());
        for(int i = 0;i<count;i++){
         int num = Integer.parseInt(br.readLine());
         if(num==0){
             if(queue.isEmpty()){
                 System.out.println(0);
             }else{
                 System.out.println(queue.poll());
             }
         }else{
             queue.add(num);
         }
        }
    }
}
