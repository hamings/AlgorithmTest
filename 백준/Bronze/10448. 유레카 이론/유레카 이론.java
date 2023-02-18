import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i = 0;i<t;i++){
            int k = Integer.parseInt(br.readLine());

            int answer = 0;
            loop:
            for(int a=1;a<k;a++){
                for(int b=1;b<k;b++){
                    for(int c=1;c<k;c++){
                        if((a*(a+1))/2+(b*(b+1))/2+(c*(c+1))/2==k){
                            answer=1;
                            break loop;
                        }
                    }
                }
            }sb.append(answer).append("\n");

        }System.out.println(sb);
    }
}