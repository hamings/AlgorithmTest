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
        Map<String,Integer> map1 = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>();
        for(int i = 0;i<n;i++){
            String name = br.readLine();
            map1.put(name,i+1);
            map2.put(i+1,name);

        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<m;i++){
            String str = br.readLine();
            if(map1.containsKey(str)){
                sb.append(map1.get(str)).append("\n");
            }else{
                int index = Integer.parseInt(str);
                sb.append(map2.get(index)).append("\n");
            }

            }

        System.out.println(sb);
    }
}