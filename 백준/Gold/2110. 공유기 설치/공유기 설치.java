import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int n,c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        System.out.println(binarySearch(1,arr[n-1]-arr[0]+1));

    }
    static int binarySearch(int left, int right){

        while(left<right) {
            int count = 1;
            int lastPosition = arr[0];
            int mid = (left + right) / 2;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] - lastPosition >= mid) {
                    lastPosition = arr[i];
                    count++;
                }
            }

            if (count < c) {
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left-1;
    }
}
