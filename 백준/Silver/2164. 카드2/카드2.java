import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1;i<=n;i++){
            queue.add(i);
        }
        int num=1;
        while(queue.size()!=1){
            if(num%2==1){
                queue.remove();
            }else{
                queue.add(queue.poll());
            }
            num++;
            
        }
        System.out.println(queue.peek());
    }
}