import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int k;

    static int[] check = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());


        if(n==k){
            System.out.println(0);
        }else{
            bfs(n);
        }


    }
    static void bfs(int x){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        check[x]=1;

        while(!queue.isEmpty()){
            int index = queue.poll();
            for(int i = 0;i<3;i++){
                int next;
                if(i==0){
                    next=index-1;
                }else if(i==1){
                    next=index+1;
                }else {
                    next=index*2;
                }

                if(next==k){
                    System.out.println(check[index]);
                    return;
                }
                if(next>0&&next<check.length&&check[next]==0){
                    check[next]=check[index]+1;
                    queue.add(next);
                }
            }

            }
        }
}
