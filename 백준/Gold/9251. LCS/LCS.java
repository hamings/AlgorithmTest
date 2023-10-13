import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] first = br.readLine().toCharArray();
        char[] second= br.readLine().toCharArray();
        System.out.println(lcs(first,second));


    }
    static int lcs(char[] first, char[] second){
        int[][] dp = new int[first.length+1][second.length+1];
        for(int i = 1;i<=first.length;i++){
            for(int j=1;j<= second.length;j++){
                if(first[i-1]==second[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[first.length][second.length];
    }
}
