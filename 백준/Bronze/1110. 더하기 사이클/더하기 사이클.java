import java.util.Scanner;

public class Main { // 더하기 사이클
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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