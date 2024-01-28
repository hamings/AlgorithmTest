import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] queueStack = new int[n];
        int[] current = new int[n];

        StringTokenizer input1 = new StringTokenizer(br.readLine());
        for(int i = 0;i<queueStack.length;i++){
            queueStack[i]=Integer.parseInt(input1.nextToken());
        }

        StringTokenizer input2 = new StringTokenizer(br.readLine());
        for(int i = 0;i<current.length;i++){
            current[i]=Integer.parseInt(input2.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] insertList = new int[m];

        StringTokenizer input3 = new StringTokenizer(br.readLine());
        for(int i = 0;i<insertList.length;i++){
            insertList[i] = Integer.parseInt(input3.nextToken());
        }
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0;i<queueStack.length;i++){
            if(queueStack[i]==0){
                deque.addFirst(current[i]);
            }
        }
        StringBuilder answer = new StringBuilder();
        for(int i = 0;i<insertList.length;i++){
            deque.add(insertList[i]);
            answer.append(deque.pollFirst()).append(" ");
        }
        System.out.println(answer);
    }
}
