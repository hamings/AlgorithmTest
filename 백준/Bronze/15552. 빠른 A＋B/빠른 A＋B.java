import java.io.*;
import java.util.StringTokenizer;

public class Main { // 빠른 A+B
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int t =Integer.parseInt(st.nextToken());

        for(int i = 0;i<t;i++){
            st = new StringTokenizer(br.readLine()," ");
            bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
