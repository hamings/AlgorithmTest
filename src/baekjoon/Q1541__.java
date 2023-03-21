package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1541__ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(),"-");
        StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"+");

        int result=0;
        while(st2.hasMoreTokens()){
            result+=Integer.parseInt(st2.nextToken());
        }
        while(st1.hasMoreTokens()){
            st2 = new StringTokenizer(st1.nextToken(),"+");
            while(st2.hasMoreTokens()){
                result-=Integer.parseInt(st2.nextToken());
            }
        }
        System.out.println(result);
    }
}
