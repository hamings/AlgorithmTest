import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        double sum = 0;
        int[] arrays = new int[n];
        for(int i = 0;i<n;i++){
            arrays[i]=sc.nextInt();
            max = Math.max(max,arrays[i]);
        }
        for(int a : arrays){
            sum+=(double)a/max*100;
        }
        System.out.println(sum/n);
    }
}