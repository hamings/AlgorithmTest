import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();
            int answer = 0;
            if(n%h==0){
                answer=h*100+n/h;
            }else{
                answer=(n%h)*100+(n/h)+1;
            }
            System.out.println(answer);
        }
    }
}