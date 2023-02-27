import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n,m;
    static String[] strings;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        strings = new String[n];
        for(int i = 0;i<n;i++){
            strings[i]= br.readLine();
        }
        int answer = Integer.MAX_VALUE;
        for(int i=0;i<n-7;i++){
            for(int j=0;j<m-7;j++){
                answer=Math.min(find(i,j),answer);
            }
        }
        System.out.println(answer);
    }

    public static int find(int a,int b){
        int count1=0;
        int count2=0;
        String wString = "WBWBWBWB";
        String bString = "BWBWBWBW";
        for(int i=a;i<a+8;i++){
            for(int j=b;j<b+8;j++) {
                if (i % 2 == 0) {
                    if (strings[i].charAt(j) != wString.charAt(j - b)) {
                        count1++;
                    }
                    if (strings[i].charAt(j) != bString.charAt(j - b)) {
                        count2++;
                    }
                } else {
                    if (strings[i].charAt(j) != bString.charAt(j - b)) {
                        count1++;
                    }
                    if (strings[i].charAt(j) != wString.charAt(j - b)) {
                        count2++;
                    }
                }

            }
        }return Math.min(count1,count2);
    }

}
