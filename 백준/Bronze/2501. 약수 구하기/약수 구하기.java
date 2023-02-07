import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int index = Integer.parseInt(st.nextToken());
        int answer = 0;
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                index--;
            }
            if(index==0){
                answer=i;
                break;
            }
        }
        System.out.println(answer);

    }
}
