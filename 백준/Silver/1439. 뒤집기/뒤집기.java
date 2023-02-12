import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] chars = str.toCharArray();
        long count0 = 0;
        long count1 = 0;
        if(chars[0]=='0'){
            count0++;
        }else{
            count1++;
        }
        for(int i = 1;i<chars.length;i++){
            if(chars[i-1]!=chars[i]){ 
                if(chars[i]=='0'){
                    count0++;
                }else {
                    count1++;
                }
            }
        }
        System.out.println(Math.min(count0,count1));
    }
}