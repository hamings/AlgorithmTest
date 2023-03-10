import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
        int[] arrays = new int[count];
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<count;i++){
            arrays[i]=Integer.parseInt(st.nextToken());
        }
        LinkedList<Integer> deque = new LinkedList<>();
        for(int i = 1;i<=num;i++){
            deque.add(i);
        }
        int n = 0;
        for(int i = 0;i<arrays.length;i++){
            boolean flag = deque.indexOf(arrays[i])<deque.size()/2+1?true:false;
            while(arrays[i]!=deque.peek()){
               if(flag){
                   deque.addLast(deque.poll());
               }else{
                   deque.addFirst(deque.pollLast());
               }
               n++;
            }
            deque.poll();
        }
        System.out.println(n);
    }
}