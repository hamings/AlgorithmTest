import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int num = sc.nextInt();
            if(num==1){
                answer++;
                continue;
            }
            for(int j = 2;j<=Math.sqrt(num);j++){
                if(num%j==0){
                    answer++;
                    break;
                }
            }
        }
        System.out.println(n-answer);
    }
}