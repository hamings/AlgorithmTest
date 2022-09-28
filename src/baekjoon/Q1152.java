package baekjoon;

import java.util.Scanner;

public class Q1152 { //단어의 개수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        String[] strSplit = str.split(" ");
        if(strSplit.length==1&&strSplit[0].equals("")){
            System.out.println("0");
        }else {
            System.out.println(strSplit.length);
        }

    }
}
