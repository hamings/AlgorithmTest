import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[][] arr = new int[count][2];
        for(int i = 0;i<count;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (o1, o2) -> o1[1]!=o2[1]? o1[1]-o2[1] : o1[0]-o2[0]) ;
        int answer = 1;
        int endTime = arr[0][1];
        for(int i =1;i< arr.length;i++){
           if(endTime<=arr[i][0]){
               answer++;
               endTime=arr[i][1];
           }
        }
        System.out.println(answer);

    }
}
