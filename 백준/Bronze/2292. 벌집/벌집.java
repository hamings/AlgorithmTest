import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int answer = 0;
        for(int i =1;i<1000000000;i++){
            if(3*i*(i-1)+1>=n){
                answer=i;
                break;
            }
        }
        System.out.println(answer);
    }
}