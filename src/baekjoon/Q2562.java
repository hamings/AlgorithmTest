package baekjoon;

import java.util.Scanner;

public class Q2562 { // 최댓값
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int index = 0;
        for(int i = 0;i<9;i++){
            int num = scanner.nextInt();
            if(max<num){
               max=num;
               index = i;
           }
        }
        System.out.println(max);
        System.out.println(index+1);
    }
}
