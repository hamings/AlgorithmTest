import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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

        Arrays.sort(arr);
        int count = 0;
        for(int i = 0;i<size;i++){
            long k = arr[i];
            int start = 0;
            int end = size-1;
            while(start<end){
                long sum = arr[start]+arr[end];
                if(sum==k){
                    if(start==i){
                        start++;
                    }else if(end==i){
                        end--;
                    }else{
                        count++;
                        break;
                    }
                }
                else if(sum<k){
                    start++;
                }else {
                    end--;
                }
            }

        }
        System.out.println(count);
    }
}
