import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean[] check = new boolean[10001];

        for(int i = 2;i<=Math.sqrt(10000);i++){
            for(int j = i*i;j<=10000;j+=i){
                check[j]=true;
            }
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int t = sc.nextInt();
            int tmp = t/2;
            for(int j = tmp;j>=2;j--){
                if(!check[j]&&!check[t-j]){
                    System.out.println(j+" "+ (t-j));
                    break;
                }
            }
        }
    }
}