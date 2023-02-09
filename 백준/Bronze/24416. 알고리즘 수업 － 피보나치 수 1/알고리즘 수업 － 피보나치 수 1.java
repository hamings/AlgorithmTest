import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n+1];
        int count = 0;
        nums[1]=1;
        nums[2]=2;
        for(int i = 3;i<=n;i++){
            count++;
            nums[i]=nums[i-1]+nums[i-2];
        }
        fib(n);
        System.out.println(indexA+" "+count);



    }
    static int indexA=1;
    static int fib(int n) {
        if (n == 1 || n == 2){
            return 1;
        }
        else {
            indexA++;
            return (fib(n - 1) + fib(n - 2));
        }
    }
}