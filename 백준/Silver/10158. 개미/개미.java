import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int currentX = Integer.parseInt(st.nextToken());
        int currentY = Integer.parseInt(st.nextToken());

        int time = Integer.parseInt(br.readLine());
        
        int delX = 1;
        int timeX = time%(2*w);
        while(timeX-->0) {
            if (currentX == 0) delX = 1;
            else if (currentX == w) delX = -1;
            currentX+=delX;
        }
        
        int delY = 1;
        int timeY = time%(2*h);
        while(timeY-->0) {
            if (currentY == 0) delY = 1;
            else if (currentY == h) delY = -1;
            currentY+=delY;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(currentX).append(" ").append(currentY);

        System.out.println(sb);
    }
}
