import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String,Integer> map = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0;i<n+m;i++){
            String str = br.readLine();
            map.put(str, map.getOrDefault(str,0)+1);
            if(map.get(str)==2){
                arrayList.add(str);
            }
        }
        sb.append(arrayList.size()).append("\n");
        Collections.sort(arrayList);

        for(String str:arrayList){
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}