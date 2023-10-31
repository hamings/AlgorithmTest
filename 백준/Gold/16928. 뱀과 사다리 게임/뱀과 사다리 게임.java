import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[] check = new int[101];
    static int[] board = new int[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = 0;i<board.length;i++){
            board[i]=i;
        }
        for(int i = 0;i<n+m;i++){
            st = new StringTokenizer(br.readLine());
            int index = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            board[index]=value;
        }
        bfs();

    }
    static void bfs(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        check[1]=0;

        while(!queue.isEmpty()){
            int visitNum = queue.poll();
            for(int i = 1;i<7;i++){
                int newNum = visitNum+i;
                if(newNum>100){
                    continue;
                }
                if(check[board[newNum]]==0){
                    queue.add(board[newNum]);
                    check[board[newNum]]=check[visitNum]+1;
                }
                if(board[newNum]==100){
                    System.out.println(check[100]);
                    return;
                }
            }
        }

    }

}
