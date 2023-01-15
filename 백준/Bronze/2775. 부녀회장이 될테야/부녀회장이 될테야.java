import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] nums = new int[15][15];
        for(int i = 0;i<15;i++){
            nums[i][1]=1;
            nums[0][i]=i;
        }

        for(int i = 1;i<15;i++){
            for(int j = 2;j<15;j++){
                nums[i][j]=nums[i][j-1]+nums[i-1][j];
            }
        }
        int t = scanner.nextInt();
        for(int i = 0;i<t;i++){
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(nums[k][n]);
        }

    }
}
