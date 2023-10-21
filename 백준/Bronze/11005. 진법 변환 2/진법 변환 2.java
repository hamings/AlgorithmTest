import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[30];
        int index = 0;
        while(n!=0){
            arr[index]=n%b;
            index++;
            n/=b;

        }

        StringBuilder sb = new StringBuilder();
        for(int i = index-1;i>=0;i--){
            if(arr[i]>9){
                sb.append((char)(arr[i]+55) );
            }else{
                sb.append(arr[i]);
            }

        }
        System.out.println(sb);
    }
}
