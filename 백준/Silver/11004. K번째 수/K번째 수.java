import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int index = Integer.parseInt(st.nextToken())-1;

        long[] arr = new long[size];

        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<size;i++){
            arr[i]=Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);

        System.out.println(arr[index]);
    }
}
