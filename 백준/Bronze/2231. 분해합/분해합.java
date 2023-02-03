import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 1;i<=n;i++){
            int a = i;
            int sum = a;
            while(a!=0){
                sum+=a%10;
                a=a/10;
            }
            if(sum==n){
                System.out.println(i);
                break;
            }
            if(i==n){
                System.out.println(0);
            }
        }
    }
}