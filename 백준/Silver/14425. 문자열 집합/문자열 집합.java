import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i = 0;i<n;i++){
            hashMap.put(br.readLine(),0);
        }
        int count=0;
        for(int i = 0;i<t;i++){
            String str = br.readLine();
            if(hashMap.containsKey(str)){
                count++;
            }
        }
        System.out.println(count);
    }
}
