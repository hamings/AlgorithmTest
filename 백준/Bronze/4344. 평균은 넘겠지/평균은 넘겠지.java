import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for(int i = 0;i<c;i++){
            int n = sc.nextInt();
            int[] array = new int[n];
            int sum = 0;
            for(int j=0;j<n;j++){
                array[j] = sc.nextInt();
                sum+=array[j];
            }
            int count = 0;
            for(int a : array){
                if(a>sum/n){
                    count++;
                }
            }

            System.out.printf("%.3f",(double)count/n*100);
            System.out.print("%");
            System.out.println();
        }
    }
}