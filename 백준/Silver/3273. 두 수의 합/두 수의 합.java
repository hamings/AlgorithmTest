import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<size;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int answer = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0;i<size;i++){
            for(int j = i+1;j<size;j++){
                if(arr[i]+arr[j]==answer){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);


    }
}
