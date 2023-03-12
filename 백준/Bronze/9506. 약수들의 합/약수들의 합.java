import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb;
        while(n!=-1){
            ArrayList<Integer> arrayList = new ArrayList<>();
            int sum = 0;
            for(int i = 1;i<=n/2;i++){
                if(n%i==0){
                    arrayList.add(i);
                    sum+=i;
                }
            }
            sb = new StringBuilder();
            if(sum==n){
                sb.append(n).append(" = ");
                for(int i = 0;i<arrayList.size()-1;i++){
                    sb.append(arrayList.get(i)).append(" + ");
                }
                sb.append(arrayList.get(arrayList.size()-1));
            }else{
                sb.append(n).append(" is NOT perfect.");
            }
            System.out.println(sb);
            n = Integer.parseInt(br.readLine());
        }
    }
}