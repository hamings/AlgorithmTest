import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr=new int[m];
        sb = new StringBuilder();
        dfs(0,0);
        System.out.println(sb);

    }
    public static void dfs(int index, int depth){
        if(depth==m){
            for(int a:arr){
                sb.append(a).append(" ");
            }
            sb.append("\n");
            return;
        }for(int i = index;i<n;i++){ 
                arr[depth]=i+1;
                dfs(i+1,depth+1);
            }
        }
    }
