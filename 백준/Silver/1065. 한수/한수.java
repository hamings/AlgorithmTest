import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(test(a));

    }
    public static int test(int a){
        if(a<100){
            return a;
        }
        else{
            int count = 0;
            for(int i = 100;i<=a;i++){
                if((i/100-(i%100)/10)-((i%100)/10-i%10)==0){
                    count++;
                }
            }
            return count+99;
        }
    }
}
