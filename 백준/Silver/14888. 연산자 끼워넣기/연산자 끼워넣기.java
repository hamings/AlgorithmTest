import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int[] num;
    static int[] operator = new int[4];
    static StringTokenizer st;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        num = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<4;i++){
            operator[i] = Integer.parseInt(st.nextToken());
        }
        dfs(num[0],1);
        System.out.println(max);
        System.out.println(min);

    }
    public static void dfs(int number,int index){
        if(index==n){
            max = Math.max(max,number);
            min = Math.min(min,number);
            return;
        }
        for(int i = 0;i<4;i++){
            if(operator[i]>0){
                operator[i]--;
                switch (i){
                    case 0:dfs(number+num[index],index+1); break;
                    case 1:dfs(number-num[index],index+1);break;
                    case 2:dfs(number*num[index],index+1);break;
                    case 3:dfs(number/num[index],index+1);break;
                }
                operator[i]++;
            }
        }

    }
}