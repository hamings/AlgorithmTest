import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0;i<n;i++){
            nums[i]=Integer.parseInt(st.nextToken());
        }

        int[] sortNums =nums.clone();
        Arrays.sort(sortNums);

        Map<Integer,Integer> map = new HashMap<>();
        int index = 0;
        for(int num : sortNums){
            if(!map.containsKey(num)){
                map.put(num,index++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int num : nums){
            sb.append(map.get(num)).append(' ');
        }
        System.out.println(sb);
    }
}