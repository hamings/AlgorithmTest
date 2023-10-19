import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String str1;
    static String str2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str1 = br.readLine();
        str2 = br.readLine();

        int answer = 0;
        for(int i=0;i<=str1.length()-str2.length();i++){
            if(check(i)){
                answer++;
                i+=str2.length()-1;
            }
        }
        System.out.println(answer);

    }
    public static boolean check(int index){
        if(str1.substring(index,index+str2.length()).equals(str2)){
            return true;
        }
        return false;
    }
}
