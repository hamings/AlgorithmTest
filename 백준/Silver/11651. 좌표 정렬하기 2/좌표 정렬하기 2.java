import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        String[][] strings = new String[n][2];
        for(int i = 0;i<n;i++){
            st=new StringTokenizer(br.readLine()," ");
            strings[i][0]=st.nextToken();
            strings[i][1]=st.nextToken();
        }
        Arrays.sort(strings, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(Integer.parseInt(o1[1])==Integer.parseInt(o2[1])){
                    return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
                }
                return Integer.parseInt(o1[1])-Integer.parseInt(o2[1]);
            }
        });
        for(int i = 0;i<n;i++){
            System.out.println(strings[i][0]+" "+strings[i][1]);
        }
    }
}