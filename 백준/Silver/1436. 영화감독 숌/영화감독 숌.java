import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int index = Integer.parseInt(br.readLine());

        int count =0;
        int num = 666;

        while(index!=count){
            if(String.valueOf(num).contains("666")){
                count++;
            }
            num++;
        }
        System.out.println(num-1);
    }
}
