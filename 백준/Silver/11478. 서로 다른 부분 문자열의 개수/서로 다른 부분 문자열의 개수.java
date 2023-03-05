import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        Set<String> set = new HashSet<>();
        for(int i=0;i<string.length();i++){
            String str = "";
            for(int j=i+1;j<=string.length();j++){
                str = string.substring(i,j);
                set.add(str);
            }
        }
        System.out.println(set.size());

    }
}
