import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i]=i+1;
        }

        for(int i = 0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int firstIndex = Integer.parseInt(st.nextToken())-1;
            int secondIndex = Integer.parseInt(st.nextToken())-1;
            int temp = arr[firstIndex];
            arr[firstIndex]=arr[secondIndex];
            arr[secondIndex]=temp;

        }
        StringBuilder sb = new StringBuilder();
        for(int a:arr){
            sb.append(a).append(" ");
        }

        System.out.println(sb);
    }
}
