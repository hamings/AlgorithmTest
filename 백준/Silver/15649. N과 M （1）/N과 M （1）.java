import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static int[] arr;
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n =Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        check = new boolean[n];
        dfs(n,m,0);
        System.out.println(sb);

    }
    public static void dfs(int n,int m,int index){
        if(index==m){
            for(int a:arr){
                sb.append(a).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0;i<n;i++){
            if(!check[i]){
                check[i]=true;
                arr[index]=i+1;
                dfs(n,m,index+1);

                check[i]=false;
            }
        }
    }
}