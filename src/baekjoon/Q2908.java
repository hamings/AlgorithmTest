package baekjoon;

import java.util.Scanner;

public class Q2908 { //상수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A>100&&A<1000&&B>100&&B<1000&&A!=B){
            A=((A%10)*100)+(((A/10)%10)*10)+A/100;
            B=((B%10)*100)+(((B/10)%10)*10)+B/100;
            if(A>B){
                System.out.println(A);
            }else {
                System.out.println(B);
            }
        }
    }
}
