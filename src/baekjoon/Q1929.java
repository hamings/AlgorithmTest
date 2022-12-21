package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1929 { // 소수 구하기

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for(int i = start;i<=end;i++){
            int count = 0;
            if(i==1){
                continue;
            }
            for(int j = 2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                sb.append(i).append("\n");
            }

        }
        System.out.println(sb.toString());
    }

}

