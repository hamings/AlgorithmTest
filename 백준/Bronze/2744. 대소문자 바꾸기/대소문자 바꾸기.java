import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();

        StringBuilder sb = new StringBuilder();
        for(char ch : chars){
            if(ch>=65&&ch<=90){
                sb.append(Character.toString(ch+32));
            }else{
                sb.append(Character.toString(ch-32));
            }
        }
        System.out.println(sb);
    }
}
