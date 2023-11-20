import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int findIdx = Integer.parseInt(br.readLine());
        int left = 0;
        int right = findIdx;
        int answer = 0;
        while(left<=right){
            int count=0;
            int mid = (left+right)/2;
            for(int i = 1;i<=size;i++){
                count+=Math.min(size, mid/i);
            }
            if(count>=findIdx){
                answer=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        System.out.println(answer);

    }

}
