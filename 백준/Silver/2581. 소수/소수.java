import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList  = new ArrayList<>();

        int a = sc.nextInt();
        if(a==1){
            a++;
        }
        int b = sc.nextInt();
        for(int i = a;i<=b;i++){
            int count = 0;
            for(int j = 2;j<i;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }if(count==0){
                arrayList.add(i);
            }
        }
        if(arrayList.size()==0){
            System.out.println(-1);
        }else{
            int sum = 0;
            for(int n : arrayList){
                sum+=n;
            }
            System.out.println(sum);
            System.out.println(arrayList.get(0));
        }
    }
}