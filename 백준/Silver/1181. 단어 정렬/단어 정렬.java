import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> arrays = new HashSet<>();
        for(int i = 0;i<n;i++){
            arrays.add(br.readLine());
        }

        String[] strings = new String[arrays.size()];
        arrays.toArray(strings);
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }else{
                    return o1.length()-o2.length();
                }
            }
        });

        for(String str : strings){
            System.out.println(str);
        }
    }

}