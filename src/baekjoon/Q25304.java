package baekjoon;

import java.util.Scanner;

public class Q25304 { //영수증
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int type = sc.nextInt();
        int sum = 0;
        for(int i = 0; i<type; i++){
            int price = sc.nextInt();
            int count = sc.nextInt();
            sum += price*count;

        }
        if(total==sum){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}

