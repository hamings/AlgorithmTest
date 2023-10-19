import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ch1 = br.readLine().toCharArray();
        char[] ch2 = br.readLine().toCharArray();
        int[] arr = new int[26];
        for(int i=0;i<ch1.length;i++){
            arr[ch1[i]-97]++;
        }
        for(int i=0;i<ch2.length;i++){
            arr[ch2[i]-97]--;
        }
        int answer =0;
        for(int a : arr){
            answer+=Math.abs(a);
        }
        System.out.println(answer);
    }
}
