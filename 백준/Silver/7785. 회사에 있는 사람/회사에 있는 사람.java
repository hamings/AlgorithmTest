import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        HashMap<String, String> map = new HashMap<>();

        for(int i=0;i<num;i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();
            if(status.equals("enter")){
                map.put(name,status);
            }else{
                map.remove(name);
            }
        }

        ArrayList<String> arrayList = new ArrayList<>(map.keySet());
        Collections.sort(arrayList,Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for(String str: arrayList){
            sb.append(str).append("\n");
        }

        System.out.println(sb);
    }


}
