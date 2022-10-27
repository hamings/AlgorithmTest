package baekjoon;

import java.util.Scanner;

public class Q25305 { //커트라인
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = sc.nextInt();
        int[] scores = new int[num];
        for(int i = 0; i< scores.length;i++){
            scores[i] = sc.nextInt();
            for(int j = 0; j<i;j++){
                if(scores[i]>scores[j]){
                    int temp = scores[j];
                    scores[j] = scores[i];
                    scores[i] = temp;
                }
            }
        }
        System.out.println(scores[count-1]);
    }
}
