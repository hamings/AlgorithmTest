import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        int answer = 0;

        for(int i = 0;i<count;i++){
            String string = br.readLine();
            if(string.equals("ENTER")){
                set.clear();
            }else if(!set.contains(string)){
                set.add(string);
                answer++;
            }
        }
        System.out.println(answer);

    }
}
