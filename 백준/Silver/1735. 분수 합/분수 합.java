
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int deno = b*d;
        int nume = a*d+b*c;
        int com = 1;

        for(int i=2;i<=Math.min(deno,nume);i++){
            if(deno%i==0&&nume%i==0){
                com=i;
            }
        }
        System.out.println(nume/com+" "+deno/com);
    }
}