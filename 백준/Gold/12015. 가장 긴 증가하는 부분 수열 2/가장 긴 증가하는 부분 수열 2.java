import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] inputs = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<inputs.length;i++) {
            inputs[i] = Integer.parseInt(st.nextToken());
        }

        int[] arr = new int[size];
        arr[0]=inputs[0];
        int length = 1;
        for(int i = 1;i<inputs.length;i++){
            int value = inputs[i];
            if(value>arr[length-1]){
                arr[length++]=value;
            }else{
                int left = 0;
                int right = length;
                while(left<right){
                    int mid = (left+right)/2;
                    if(arr[mid]<value){
                        left=mid+1;
                    }else{
                        right=mid;
                    }
                }
                arr[left]=value;
            }
        }
        System.out.println(length);

    }
}
