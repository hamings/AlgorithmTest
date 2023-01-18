import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int n = Integer.parseInt(br.readLine());
            int answer = 0;
            if(n==0){
                break;
            }else{
                for(int i = n+1;i<=2*n;i++){
                    int count = 0;
                    for(int j = 2;j<=Math.sqrt(i);j++){
                        if(i%j==0){
                            count++;
                            break;
                        }
                    }if(count==0){
                        answer++;
                    }
                }
                System.out.println(answer);
            }

        }
    }
}
