import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String,Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++){
            String str = st.nextToken();
            map.put(str, 1);
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<m;i++){
            String str = st.nextToken();
            map.put(str, map.getOrDefault(str,0)+1);
        }
        int count=0;
        for(String str : map.keySet()){
            if(map.get(str)==1){
                count++;
            }
        }
        System.out.println(count);
    }
}