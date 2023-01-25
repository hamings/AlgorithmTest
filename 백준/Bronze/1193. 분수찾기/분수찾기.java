import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 1;

        while(true){
            if(n<=sum+count){
                if(count%2==1){
                    System.out.println((count-(n-sum-1))+"/"+(n-sum));
                    break;
                }else{
                    System.out.println((n-sum)+"/"+(count-(n-sum-1)));
                    break;
                }
            }else {
                sum+=count;
                count++;
            }
        }
    }
}