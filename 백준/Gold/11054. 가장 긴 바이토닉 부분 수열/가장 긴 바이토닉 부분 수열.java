import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int size;
    static int[] arr;
    static int[] leftDp;
    static int[] rightDp;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        arr= new int[size];
        leftDp= new int[size];
        rightDp= new int[size];


        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0;i<size;i++){
            arr[i]=Integer.parseInt(st.nextToken());

        }

        for(int i=0;i<size;i++){
            leftDp[i]=1;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]&&leftDp[i]<leftDp[j]+1){
                    leftDp[i]++;
                }
            }
        }
        for(int i=size-1;i>=0;i--){
            rightDp[i]=1;
            for(int j=size-1;j>i;j--){
                if(arr[j]<arr[i]&&rightDp[i]<rightDp[j]+1){
                    rightDp[i]++;
                }
            }
        }
        int result = 0;
        for(int i=0;i<size;i++){
            int sum = leftDp[i]+rightDp[i]-1;
            result= Math.max(result,sum);
        }
        System.out.println(result);



    }



}
