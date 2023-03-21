package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1110 { // 더하기 사이클
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = n%10;
        int b = n/10 + a;
        int count = 1;
        while(n!=(10*a+b)){
            int temp = a;
            a = b;
            b = (temp+b)%10;
            count++;

        }
        System.out.println(count);
    }
}
