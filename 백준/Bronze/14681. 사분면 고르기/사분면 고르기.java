import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer;
        if(a>0){
            if(b>0){
                answer = 1;
            }else{
                answer = 4;
            }
        }else{
            if(b>0){
                answer = 2;
            }else{
                answer = 3;
            }
        }
        System.out.println(answer);
    }
}